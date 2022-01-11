import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import generic.TestGeneric;
import models.ConstructorExample;
import models.Student;

public class App {
    public static void main(String[] args) throws Exception {
    //    List<Student> students = new ArrayList<>();
  
       

    //    for(int i=0; i<10; i++)
    //    {
    //        var student = new Student();
    //        student.setName("Hari");
    //        students.add(student);
    //    }

    //    for (Student student : students) {
    //     System.out.print(student.getId());
    //     System.out.print(" " + student.getName());
    //     System.out.println("\n");


    // }
    // var ce2 = new ConstructorExample(1,"Ram");
    // var ew = new ConstructorExample(1099);
    // var ce3 = new ConstructorExample(1,"Ram");
    // System.out.println(ce2.getId());
    // System.out.println(ce2.getName());
    // System.out.println(ew.getId() + ew.getName());
    // System.out.println(ce3.getName()+ce3.getId());

    // TestGeneric<Integer,String,Double> genEx = new TestGeneric<>(1, "roll", 2.4);

    // System.out.println(genEx.getRoll());
    // System.out.println(genEx.getName());
    // System.out.println(genEx.getAddress());


    JFrame frame = new JFrame("Calculator");
    frame.setSize(1000,1000);
    JLabel label = new JLabel("Hello");
    label.setSize(200,200);
    
    JTextField field = new JTextField("Enter Name");
    
    frame.add(field);
    frame.add(label);
    frame.getLayeredPane().setBackground(Color.BLUE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    

    
    }
}
