import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    MainFrame(){
        super("Hello World");
        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbar = new Toolbar();
        formPanel = new FormPanel();

        setJMenuBar(createMenuBar());

        // EVENT LISTENERS
        toolbar.setStringListener(new StringListener() {
            @Override
            public void sendText(String text) {
                textPanel.appendText(text);
            }
        });


        formPanel.setFormListener(new FormListener() {
            @Override
            public void formEventTrigger(FormEvent e) {
                textPanel.appendText(String.valueOf(e));
            }
        });

        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        //Menu
        JMenuItem file = new JMenu("File");
        JMenuItem edit = new JMenu("Edit");
        JMenuItem view = new JMenu("View");

        //Menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem settingsItem = new JMenuItem("Settings");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("paste");
        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem redoItem = new JMenuItem("Redo");
        JMenuItem toolsItem = new JMenuItem("Tools");
        JMenuItem gitItem = new JMenuItem("Git");
        JMenuItem commitItem = new JMenuItem("Commit");

        file.add(newItem);
        file.add(openItem);
        file.add(settingsItem);

        edit.add(cutItem);
        edit.add(copyItem);
        edit.add(pasteItem);
        edit.add(undoItem);
        edit.add(redoItem);

        view.add(toolsItem);
        view.add(gitItem);
        view.add(commitItem);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);

        return menuBar;
    }
}