import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream inputStream = CharStreams.fromFileName("D:\\Univer\\Конструирование компиляторов (1-2 маг)\\PSUTI_Ezhov_Lang45Parser\\src\\model_lang45correct.txt");
            model_lang45Lexer myLexer = new model_lang45Lexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(myLexer);
            model_lang45Parser myParser = new model_lang45Parser(commonTokenStream);
            model_lang45Parser.ProgramContext programContext = myParser.program();



            model_lang45MyListener listener = new model_lang45MyListener();
            ParseTreeWalker.DEFAULT.walk(listener, programContext);

            // show tree in gui
            JFrame frame = new JFrame("Syntax Tree");
            JPanel panel = new JPanel();
            TreeViewer treeViewer = new TreeViewer(Arrays.asList(myParser.getRuleNames()), programContext);
            treeViewer.setScale(1.3);
            panel.add(treeViewer);
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setViewportView(panel);
            frame.add(scrollPane);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
