import java.awt.*;
public class FirstApp extends Frame
{   Label l;
    TextField  tf;
    Button b;
    public FirstApp()
    {
        super("My App");
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) 
    {   
      FirstApp f=new FirstApp();
      f.setSize(400,400);
      f.setVisible(true);
      








        /*METHOD 1
        Frame f=new Frame("My First App");
        f.setLayout(new FlowLayout());
        Button b=new Button("OK");
        Label l=new Label("Name");
        TextField tf=new TextField(20);
        f.add(b);
        f.add(l);
        f.add(tf);
        f.setSize(500,500);
        f.setVisible(true);*/
    }
}
