package solidPrinciple.interfaceSegrigation;


/**all abstract method in one interface which doesn't follow interface segrigation*/
interface Document {
    void open();
    void save();
    void print();
    void fax();
}

/**one interface define related method which follow interface segrigation*/
interface Openable {
    void open();
}

interface Savable {
    void save();
}

interface Printable {
    void print();
}

interface Faxable {
    void fax();
}

class TextDocument implements Openable, Savable {
    @Override
    public void open() {
        System.out.println("Opening text document");
    }

    @Override
    public void save() {
        System.out.println("Saving text document");
    }
}

class PdfDocument implements Openable, Savable, Printable {
    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
    }

    @Override
    public void print() {
        System.out.println("Printing PDF document");
    }
}

public class InterfaceSegrigationExample {
	public static void main(String[] args) {
		
		TextDocument textDocument = new TextDocument();
		textDocument.open();
		textDocument.save();
		
		PdfDocument pdfDocument = new PdfDocument();
		pdfDocument.open();
		pdfDocument.save();
		pdfDocument.print();
	}
}
