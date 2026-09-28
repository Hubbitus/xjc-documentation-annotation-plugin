# xjc-documentation-annotation-plugin-example-gradle

This is gradle demo project to show how to use Java code generation from XSD scheme with [xjc-documentation-annotation-plugin](https://github.com/Hubbitus/xjc-documentation-annotation-plugin).

> **Please note** it is independent project, not gradle submodule of plugin!

For run generation just invoke:

    ./gradlew xjc

After compilation you will find generated classes in `build/generated/sources/xjc/java`

Then you may with run tests:

    ./gradlew check
