package PrintStudent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.print.PrintException;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

public class PrintStudentRec {

	private JFrame frame;
	private JTextField textStudentName;
	private JTextField textStudentID;
	private JTextField textDOB;
	private JTextField textAddress;
	private JTextField textMobileNo;
	private JTextField textCourseTitle;
	private JTextField textCourseCode;
	private JTextField textReferenceNo;
	protected JLabel txtReceipt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintStudentRec window = new PrintStudentRec();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrintStudentRec() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1360, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 12));
		panel.setBounds(10, 11, 1263, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHeadLine = new JLabel("Print Student Records in Java ");
		lblHeadLine.setFont(new Font("Tahoma", Font.BOLD, 78));
		lblHeadLine.setBounds(43, -12, 1199, 112);
		panel.add(lblHeadLine);
		
		JLabel lblReferenceNo = new JLabel("Reference No");
		lblReferenceNo.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblReferenceNo.setBounds(10, 122, 251, 46);
		frame.getContentPane().add(lblReferenceNo);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblMobileNo.setBounds(10, 586, 251, 46);
		frame.getContentPane().add(lblMobileNo);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtReceipt.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtReceipt.setBounds(632, 122, 641, 510);
		frame.getContentPane().add(txtReceipt);
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReceipt.append("\t\t Student Records \n\n" + "Reference No: \t\t\t" + textReferenceNo.getText() +
						"\n===============================================\n" +
						"Course Code:\t\t\t"+ textCourseCode.getText()+ "\n\n" +
						"course Title:\t\t\t"+ textCourseTitle.getText()+ "\n\n" +
						"Student ID:\t\t\t"+ textStudentID.getText()+ "\n\n" +
						"Student Name:\t\t\t"+ textStudentName.getText()+ "\n\n" +
						"Date of Birth:\t\t\t"+ textDOB.getText()+ "\n\n" +
						"Address:\t\t\t"+ textAddress.getText()+ "\n\n" +
						"Mobile No:\t\t"+ textMobileNo.getText()+ "\n" +
						"=================================================");
				
			}
		});
		btnAddRecord.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAddRecord.setBounds(21, 643, 229, 46);
		frame.getContentPane().add(btnAddRecord);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblAddress.setBounds(10, 529, 251, 46);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblCourseCode.setBounds(10, 201, 251, 46);
		frame.getContentPane().add(lblCourseCode);
		
		JLabel lblCourseTitle = new JLabel("Course Title");
		lblCourseTitle.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblCourseTitle.setBounds(10, 274, 251, 46);
		frame.getContentPane().add(lblCourseTitle);
		
		JLabel lblDOB = new JLabel("Date of Birth");
		lblDOB.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblDOB.setBounds(10, 472, 251, 46);
		frame.getContentPane().add(lblDOB);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblStudentID.setBounds(10, 341, 251, 46);
		frame.getContentPane().add(lblStudentID);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblStudentName.setBounds(10, 407, 264, 46);
		frame.getContentPane().add(lblStudentName);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtReceipt.print();
				}catch(PrinterException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPrint.setBounds(376, 643, 229, 46);
		frame.getContentPane().add(btnPrint);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMobileNo.setText(null);
				textAddress.setText(null);
				textDOB.setText(null);
				textStudentName.setText(null);
				textStudentID.setText(null);
				textCourseTitle.setText(null);
				textCourseCode.setText(null);
				textReferenceNo.setText(null);
				txtReceipt.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClear.setBounds(741, 643, 229, 46);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Print System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1044, 643, 229, 46);
		frame.getContentPane().add(btnExit);
		
		textStudentName = new JTextField();
		textStudentName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textStudentName.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textStudentName.setBounds(298, 407, 324, 41);
		frame.getContentPane().add(textStudentName);
		textStudentName.setColumns(10);
		
		textStudentID = new JTextField();
		textStudentID.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textStudentID.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textStudentID.setColumns(10);
		textStudentID.setBounds(298, 346, 324, 41);
		frame.getContentPane().add(textStudentID);
		
		textDOB = new JTextField();
		textDOB.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textDOB.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textDOB.setColumns(10);
		textDOB.setBounds(298, 477, 324, 41);
		frame.getContentPane().add(textDOB);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textAddress.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textAddress.setColumns(10);
		textAddress.setBounds(298, 534, 324, 41);
		frame.getContentPane().add(textAddress);
		
		textMobileNo = new JTextField();
		textMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textMobileNo.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textMobileNo.setColumns(10);
		textMobileNo.setBounds(298, 591, 324, 41);
		frame.getContentPane().add(textMobileNo);
		
		textCourseTitle = new JTextField();
		textCourseTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textCourseTitle.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textCourseTitle.setColumns(10);
		textCourseTitle.setBounds(298, 279, 324, 41);
		frame.getContentPane().add(textCourseTitle);
		
		textCourseCode = new JTextField();
		textCourseCode.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textCourseCode.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textCourseCode.setColumns(10);
		textCourseCode.setBounds(298, 206, 324, 41);
		frame.getContentPane().add(textCourseCode);
		
		textReferenceNo = new JTextField();
		textReferenceNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textReferenceNo.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		textReferenceNo.setColumns(10);
		textReferenceNo.setBounds(298, 122, 324, 41);
		frame.getContentPane().add(textReferenceNo);
		
		
	}
}
