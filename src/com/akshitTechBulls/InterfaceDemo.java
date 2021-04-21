package com.akshitTechBulls;

// Can't create object of interface class
interface InWriter { // In interface class, all methods are abstract. (You can't specify the body)
    //    public abstract void write(); By default all methods are public and abstract
    void write();
}

class InPen implements InWriter {
    @Override
    public void write() {
        System.out.println("Write using pen.");
    }
}

class InPencil implements InWriter {
    @Override
    public void write() {
        System.out.println("Write using pen.");
    }
}

class InTool {
    public void writing(InWriter writer) {
        writer.write();
    }

    public void anonymous() {
        System.out.println("Class method.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        InWriter pen = new InPen();
        InWriter pencil = new InPencil();

        InTool inTool = new InTool();
        inTool.writing(pen);

        InTool inTool1 = new InTool() { // Anonymous inner class
            @Override
            public void anonymous() {
                System.out.println("This is anonymous method.");
            }
        };
        inTool1.anonymous();

        InWriter inWriter = new InWriter() {
            @Override
            public void write() {
                System.out.println("This is anonymous method with interface.");
            }
        };
        inWriter.write();
    }
}
