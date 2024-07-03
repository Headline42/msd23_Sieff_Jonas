# Exercise 6

To make a Maven Site with all your project info, you need to:

1. Set up the `maven-site-plugin` in `pom.xml` file.
2. Make a `site.xml` file to decide what goes on the site and how it looks.
3. Write docs in markdown or other formats that Maven knows.
4. Run `mvn site` and Maven will put it together.

The `pom.xml` and `site.xml` files do different things:

`pom.xml`:
- Tells Maven about the project (name, version, what it's about)
- Sets up plugins to make reports (like javadocs and test coverage)
- Configures the plugins

`site.xml`:
- Decides how the site is laid out and what's in the menus
- links to other stuff outside your project
- Add pages and content

 run `mvn site`

- All the info about the project
- Javadocs so people know how to use the code
- Test coverage reports to show how well the code is tested
- Any extra docs

![](/resources/images/ex6_1.png)

_Screenshot 1:_ Maven site with the "Good Style" page

![](/resources/images/ex6_2.png)

_Screenshot 2:_ Javadoc for the project

![](/resources/images/ex6_3.png)

_Screenshot 3:_ Test coverage report