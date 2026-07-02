# Week 2

This week has a simple Spring example for setter injection.

## What it does
`BookRepository` returns the book details, `BookService` receives it through Spring, and `LibraryManagementApplication` prints the result.

## Run it
From the `Week-2` folder, run:

```powershell
mvn clean compile exec:java -Dexec.mainClass=com.library.LibraryManagementApplication
```

## Output

```text
Book details: Effective Java by Joshua Bloch
```
