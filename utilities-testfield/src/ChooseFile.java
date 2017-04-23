import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.util.Scanner;

public class ChooseFile 
{

	File selectedFile;
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		ChooseFile cFile = new ChooseFile();		
		cFile.run();
	}
	
	public void run()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JComboBox Test");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Select File");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) 
				{
					selectedFile = fileChooser.getSelectedFile();
					try
					{
						parse(selectedFile);
					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void parse(File selectedFile) throws FileNotFoundException
	{
		Scanner input = new Scanner(selectedFile);
		
		while (input.hasNext())
		{
			String tokens[] = input.nextLine().split("\\s"); 
			System.out.println(tokens[0] + tokens[1]);
		}
		
		input.close();
	}
}









