# Stack Kata
In computer science, a stack is a famous abstract data type that provides certain operations on a collection of elements. Stacks have a [long history](https://en.wikipedia.org/wiki/Stack_(abstract_data_type)#History), dating back to the very first computer programs and were first documented in 1946.

While you may never need to build a stack yourself, you probably interact with one in your everyday programming in the form of a [call stack](https://en.wikipedia.org/wiki/Function_(computer_programming)#Call_stack), so it seems like an important concept to learn about. 

Building stacks also provides an opportunity to practise our baby steps in test driven development.


# Instructions
For this kata, build a stack that supports these operations:

* **Push** - Add an element to the top of the stack    
* **Pop** - Remove an element from the top of the stack, returning it
* **Empty** check - Check if the stack is empty or not
* **Size** - Count of the elements in the stack
* **Peek** - Check the top of the stack without popping

![stack](https://www.codurance.com/hs-fs/hubfs/Katalyst/Kata%20assets/Stack/stack-example.jpg?width=1079&height=926&name=stack-example.jpg)

Whilst building out these operations, think about the simplest way possible first. Don't go for what you think might be the final implementation right away.

Here are some more important details to consider while building your stack. You could even think of them as iterative requirements along with your operations:

* Handle overflows when too many elements are pushed to the stack
* Handle underflows when too many elements are popped off the stack
* Handle underflows when there are no elements to peek on the stack
* Handle attempts to create a stack with an invalid capacity (negative numbers)
You may recognise one of these requirements as the origin of the famous phrase “Stack Overflow”, which also serves as the name of a certain website you probably look at everyday.

# Extra requirement

After you have completed building your stack and if you want to go a bit further, try the following.

Your stack currently has protection for a capacity of 0. This is also known as a 'null stack' and a stack with more than 0 is known as a 'bounded stack'. Do you really need all that other code if you receive the request to create a null stack?

There are ways in programming to provide fixed behaviour for known situations. For example, you know for a null stack it will always be empty, always overflow when a push is attempted, and always underflow when a pop is attempted.

## Instructions
If the language you are using supports [polymorphism](https://en.wikipedia.org/wiki/Polymorphism_(computer_science)), come up with a way to update the creation of a stack, so that it creates a null or bounded stack based on the requested capacity. Then you can add only the code you need to each situation. Your tests should remain the same, but the underlying behaviour has changed.

> Source: https://www.codurance.com/katalyst/stack


# Base para hacer tests

Configuración básica para empezar a hacer una kata o aprender a hacer tests en los siguientes lenguajes:

- PHP y PHPUnit
- Javascript con Jest
- Typescript con Deno
- Java, Junit y Mockito
- Scala, Munit y Scalacheck
- Kotlin, JUnit5 y MockK
- C#, xUnit (con FluentAsertion) y NSubstitute (para mock)

# Configuración específica por lenguaje

## PHP con PHPUnit

1. Instalar [composer](https://getcomposer.org/) `curl -sS https://getcomposer.org/installer | php`
2. `composer install` (estando en la carpeta php)
3. `./vendor/bin/phpunit`

### 📚 Documentación
- [PHPUnit](https://phpunit.readthedocs.io/)
- [Prophecy](https://github.com/phpspec/prophecy) para dobles de prueba

## Javascript con Jest

1. Instalar [Node](http://nodejs.org/)
2. `npm install` (Estando en la carpeta javascript)
3. `npm test`

### 📚 Documentación
- [Jest](https://jestjs.io)

## Typescript con Deno

1. Instalar [Deno](https://deno.land/#installation)
2. `deno test` (Estando en la carpeta typescript)

### 📚 Documentación
- [Deno](https://deno.land/manual)
- [BDD module](https://deno.land/manual/testing/behavior_driven_development)
- [Expect module](https://deno.land/x/expect)

## Java con Junit y Mockito

1. Instalar las dependencias y tests con Maven [mvn test]
2. Ejecutar los tests con el IDE

### 📚 Documentación
- [JUnit](https://github.com/junit-team/junit/wiki)
- [Mockito](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html)

## Scala con Munit y Scalacheck

1. `sbt` (en la carpeta scala)
2. `~test` para ejecutar los test en hot reload

### 📚 Documentación
- [Munit](https://scalameta.org/munit/docs/tests.html)
- [Scalacheck](https://github.com/typelevel/scalacheck/blob/main/doc/UserGuide.md) para testing basado en propiedades

### Linux/Mac
1. Instalar [SDKMan](https://sdkman.io/)
2. `sdk install java 11.0.12-open` instala OpenJDK
3. `sdk install sbt` una vez instalado SDKMan

### Windows
1. Instalar [OpenJDK](https://docs.microsoft.com/es-es/java/openjdk/download#openjdk-110141-lts--see-previous-releases)
2. Instalar [SBT](https://www.scala-sbt.org/download.html)

### Visual Studio Code
1. Descargar [Visual Studio Code](https://code.visualstudio.com/)
2. Instalar para VS Code [Metals](https://scalameta.org/metals/docs/editors/vscode)

## Kotlin con JUnit5 y MockK

1. Por consola: Puedes instalar dependencias y lanzar los tests con `gradlew test`
2. Usando IDE: Simplemente abre el proyecto desde el raiz de la plantilla Kotlin

### 📚 Documentación
- [JUnit5](https://junit.org/junit5/)
- [MockK](https://mockk.io/)

## C# con  xUnit (con FluentAsertion) y NSubstitute (para mock)

1. Instalar Microsoft Visual Studio Community 2022
2. Abre el proyecto y se descargaran automáticamente los paquetes Nuguet necesarios
3.
### 📚 Documentación
- [xUnit](https://xunit.net/)
- [NSubstitute](https://nsubstitute.github.io/help.html)
- [FluentAssertions](https://fluentassertions.com/introduction)

## Python
1. Instalar python 3.x
2. Una vez descargado el código fuente dentro de la carpeta */python/ creamos un virtual enviroment:
3. `python3 -m venv env`
4. Activamos en virtual environment:
- windows: `.\env\Scripts\activate.bat`
- linux/mac: `source env/bin/activate`
5. `pytest` para ejecutar los tests.
