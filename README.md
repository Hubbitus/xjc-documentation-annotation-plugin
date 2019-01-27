XJC plugin to bring XSD descriptions into annotations of generated classes
==========================================================================

Why that plugin born you may find at the end of readme, but now lets look what it does and how to use it!

## What it does: \<annotation>\<documentation> -> Java class annotations

Said we have this object described in XSD:

```
<xs:complexType name="CadastralBlock">
	<xs:annotation>
		<xs:documentation>Кадастровый квартал</xs:documentation>
	</xs:annotation>
	<xs:sequence>
		<xs:element name="number" type="xs:string">
			<xs:annotation>
				<xs:documentation>Кадастровый номер</xs:documentation>
			</xs:annotation>
		</xs:element>
</xs:complexType>
```

We run xjc like:

    xjc -npa -no-header -d src/main/generated-java/ -p xsd.generated scheme.xsd

And got class like (getters, setters and any annotations omitted for simplicity):

```java
public class CadastralBlock {
    protected String number;
}
```

**But in my case I want known how to class and fields was named in source file!**
So it what these plugin do!

So you get:

```java
@XsdInfo(name = "Кадастровый квартал", xsdElementPart = "<complexType name=\"CadastralBlock\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"number\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n        <element name=\"Orient\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </sequence>\n      <attribute name=\"_id\" use=\"required\" type=\"{http://www.w3.org/2001/XMLSchema}token\" />\n    </restriction>\n  </complexContent>\n</complexType>")
public class CadastralBlock {
    @XsdInfo(name = "Кадастровый номер")
    protected String number;
}
```

## How to use

### Manual call in commandline
If you want run it manualy ensure jar class with plugin in run classpath and just add option `-XPluginDescriptionAnnotation`. F.e.:

    xjc -npa -no-header -d src/main/generated-java/ -p xsd.generated -XPluginDescriptionAnnotation scheme.xsd

### Call from Java/Groovy
	Driver.run(
		[
			'-XPluginDescriptionAnnotation'
			,'-d', generatedClassesDir.absolutePath
			,'-p', 'info.hubbitus.generated.test'
			,'CadastralBlock.xsd'
		] as String[]
		,new XJCListener() {...}
	)

See test [XJCPluginDescriptionAnnotationTest](src/test/groovy/info/hubbitus/XJCPluginDescriptionAnnotationTest.groovy) for example.

## Development:

Build:

    ./gradlew jar

Run tests:

    ./gradlew test

## Rationale
For our integration we have task load big amount of XSD files into MDM software (proprietary [Unidata](https://unidata-platform.com/)).

`XJC` is good tool for generate Java `DTO` classes from `XSD` specification. It was first part ow way.
Then I got excellent [reflections](https://github.com/ronmamo/reflections) library and travers generated classes.

Problem was I was not be able name my model items with original annotations! Despite XJC place initial Javadoc which contains description and related part of XML element it have several problems:
1. That only for class, and absent fo fields.
2. Even for class I can't use javadoc in runtime

First approach to parse XSD for documentation on groovy works, but was very fragile and always require get updates and hacks.

I long time search way to bring such annotations into DTO classes itself to do not do work twice (generate classes and again parse XSD files manually).
I did not found solution. And it is the reason born of that plugin.

## Licensed under MIT
