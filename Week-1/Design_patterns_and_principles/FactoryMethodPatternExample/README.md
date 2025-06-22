# Factory Method Pattern Example

This project demonstrates the implementation of the Factory Method Design Pattern in a document management system. The Factory Method Pattern is a creational pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

## Project Structure

```
src/
├── Document.java                 # Interface defining document operations
├── WordDocument.java            # Concrete implementation for Word documents
├── PdfDocument.java             # Concrete implementation for PDF documents
├── ExcelDocument.java           # Concrete implementation for Excel documents
├── DocumentFactory.java         # Abstract factory class
├── WordDocumentFactory.java     # Concrete factory for Word documents
├── PdfDocumentFactory.java      # Concrete factory for PDF documents
├── ExcelDocumentFactory.java    # Concrete factory for Excel documents
└── FactoryMethodDemo.java       # Demo class showing pattern usage
```

## Design Pattern Components

1. **Product** (`Document` interface)
   - Defines the interface for objects the factory method creates

2. **Concrete Products** (`WordDocument`, `PdfDocument`, `ExcelDocument`)
   - Implements the Product interface

3. **Creator** (`DocumentFactory`)
   - Declares the factory method that returns the product

4. **Concrete Creators** (`WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory`)
   - Overrides the factory method to return a specific product

## Running the Demo

To run the demo:
1. Compile all Java files
2. Run the FactoryMethodDemo class

## Output Example

```
Creating Word Document
Opening Word Document
Saving Word Document

------------------------

Creating PDF Document
Opening PDF Document
Saving PDF Document

------------------------

Creating Excel Document
Opening Excel Document
Saving Excel Document
```

## Conclusion

This example demonstrates how the Factory Method Pattern can be used to create different types of documents in a scalable and maintainable way. By encapsulating the creation logic in factory classes, the system becomes easy to extend with new document types without modifying existing code. This approach promotes flexibility, reusability, and adherence to solid design principles in software development.
