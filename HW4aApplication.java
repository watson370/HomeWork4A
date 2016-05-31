package csc262HW4a;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JList;








import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class HW4aApplication extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel JButton;
	private JLabel JComboBox;
	private JLabel JTextField;
	private JComboBox comboBox;
	private JLabel JRadioButton;
	private JRadioButton rdbtnNewRadioButton;
	private JLabel lblJtogglebutton;
	private JToggleButton tglbtnToggleMeFor;
	private JRadioButton rdbtnRadioButton;
	private JLabel lblJlistListener;
	private JList<String> list;
	private ButtonGroup bg;
	private Font p;
	private Font bi;
	private JLabel status;
	String[] icons = {"angrybirds.jpg","check.jpg", "jrathage.jpg", "pacman.jpg", "Twitter-icons-web-design-54.jpg" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HW4aApplication frame = new HW4aApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HW4aApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton = new JLabel("New label");
		GridBagConstraints gbc_JButton = new GridBagConstraints();
		gbc_JButton.insets = new Insets(0, 0, 5, 5);
		gbc_JButton.gridx = 0;
		gbc_JButton.gridy = 0;
		contentPane.add(JButton, gbc_JButton);
		
		
		JButton btnClickMe = new JButton("Click Me!!!");
		btnClickMe.addActionListener(new ActionListener() {//ActionListener
			public void actionPerformed(ActionEvent e) {
				JButton.setText("You Clicked the JButton!!");
			}
		});
		GridBagConstraints gbc_btnClickMe = new GridBagConstraints();
		gbc_btnClickMe.insets = new Insets(0, 0, 5, 5);
		gbc_btnClickMe.gridx = 1;
		gbc_btnClickMe.gridy = 0;
		contentPane.add(btnClickMe, gbc_btnClickMe);
		
		JTextField = new JLabel("New label");
		GridBagConstraints gbc_JTextField = new GridBagConstraints();
		gbc_JTextField.anchor = GridBagConstraints.EAST;
		gbc_JTextField.insets = new Insets(0, 0, 5, 5);
		gbc_JTextField.gridx = 0;
		gbc_JTextField.gridy = 1;
		contentPane.add(JTextField, gbc_JTextField);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		toggleKeyListener testKeyTyped = new toggleKeyListener();
		textField.addKeyListener(testKeyTyped);
		
		JComboBox = new JLabel("New label");
		GridBagConstraints gbc_JComboBox = new GridBagConstraints();
		gbc_JComboBox.anchor = GridBagConstraints.EAST;
		gbc_JComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_JComboBox.gridx = 0;
		gbc_JComboBox.gridy = 2;
		contentPane.add(JComboBox, gbc_JComboBox);
		
		String[] s = {"This feature was replaced with the JList", "But here is another box", "and another"};
		comboBox = new JComboBox(s);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboBox, gbc_comboBox);
		
		JRadioButton = new JLabel();
		GridBagConstraints gbc_JRadioButton = new GridBagConstraints();
		gbc_JRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_JRadioButton.gridx = 0;
		gbc_JRadioButton.gridy = 3;
		contentPane.add(JRadioButton, gbc_JRadioButton);
		
		rdbtnNewRadioButton = new JRadioButton("plain", false);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 3;
		contentPane.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		rdbtnRadioButton = new JRadioButton("Bold and Italics", false);
		GridBagConstraints gbc_rdbtnRadioButton = new GridBagConstraints();
		gbc_rdbtnRadioButton.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnRadioButton.gridx = 2;
		gbc_rdbtnRadioButton.gridy = 3;
		contentPane.add(rdbtnRadioButton, gbc_rdbtnRadioButton);
		
		bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnRadioButton);
		p = new Font("Serif",Font.PLAIN, 15);
		bi = new Font("Serif", Font.BOLD + Font.ITALIC, 15);
		rdbtnNewRadioButton.addItemListener(new ItemHandler(p));//ItemListener
		rdbtnRadioButton.addItemListener(new ItemHandler(bi));
		
		
		lblJtogglebutton = new JLabel("JToggleButton");
		GridBagConstraints gbc_lblJtogglebutton = new GridBagConstraints();
		gbc_lblJtogglebutton.insets = new Insets(0, 0, 5, 5);
		gbc_lblJtogglebutton.gridx = 0;
		gbc_lblJtogglebutton.gridy = 4;
		contentPane.add(lblJtogglebutton, gbc_lblJtogglebutton);
		
		tglbtnToggleMeFor = new JToggleButton("Toggle me for a key listener");
		GridBagConstraints gbc_tglbtnToggleMeFor = new GridBagConstraints();
		gbc_tglbtnToggleMeFor.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnToggleMeFor.gridx = 1;
		gbc_tglbtnToggleMeFor.gridy = 4;
		contentPane.add(tglbtnToggleMeFor, gbc_tglbtnToggleMeFor);
		toggleKeyListener tglbtnToggleMeForListener = new toggleKeyListener();
		tglbtnToggleMeFor.addKeyListener(tglbtnToggleMeForListener);
		
		lblJlistListener = new JLabel("JList listener");
		GridBagConstraints gbc_lblJlistListener = new GridBagConstraints();
		gbc_lblJlistListener.insets = new Insets(0, 0, 5, 5);
		gbc_lblJlistListener.gridx = 0;
		gbc_lblJlistListener.gridy = 5;
		contentPane.add(lblJlistListener, gbc_lblJlistListener);
		
		list = new JList(icons);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 5;
		contentPane.add(new JScrollPane(list), gbc_list);
		list.addListSelectionListener(
				new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent e) {
						lblJlistListener.setIcon(new ImageIcon(getClass().getResource(list.getSelectedValue())));						
					}
				}
				);
		
		MHandler handler = new MHandler();
		this.addMouseListener(handler);
		this.addMouseMotionListener(handler);
		
		status = new JLabel("New label");
		status.setLayout(new FlowLayout());
		GridBagConstraints gbc_status = new GridBagConstraints();
		gbc_status.insets = new Insets(0, 0, 0, 5);
		gbc_status.gridx = 1;
		gbc_status.gridy = 6;
		contentPane.add(status, gbc_status);
		
	}
	private class ItemHandler implements ItemListener
	{
		private Font font;
		public ItemHandler(Font g)
		{
			font = g;
		}
		public void itemStateChanged(ItemEvent event)
		{
			JRadioButton.setFont(font);
		
		if(event.getSource() == rdbtnNewRadioButton)
		{
			JRadioButton.setText("You Chose the Plain radio button");
			
		}
		else 
		{
			JRadioButton.setText( "You Chose the Bold and Italics radio button");
		}
		}
	}
	private class toggleKeyListener implements KeyListener
	{
		public void keyPressed(KeyEvent event)
		{
			if(tglbtnToggleMeFor.isSelected())
			lblJtogglebutton.setText(String.format("Key Pressed %s", KeyEvent.getKeyText(event.getKeyCode())));
		
		}
		public void keyReleased(KeyEvent event)
		{
			if(tglbtnToggleMeFor.isSelected())
			lblJtogglebutton.setText(String.format("Key Released %s", KeyEvent.getKeyText(event.getKeyCode())));
	
		}
		public void keyTyped(KeyEvent event)
		{
			if(event.getSource() == textField)
			{
				JTextField.setText(String.format("Key Released %s", KeyEvent.getKeyText(event.getKeyCode())));
			}//docs says won't return good value for this
		}
	}
	private class MHandler implements MouseListener, MouseMotionListener
	{
		public void mouseClicked(MouseEvent event)
		{
			status.setText(String.format("You Clicked the Mouse at [%d %d]", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event)
		{
			status.setText(String.format("You pressed the Mouse at [%d %d]", event.getX(), event.getY()));
		}
		public void mouseReleased(MouseEvent event)
		{
			status.setText(String.format("You released the Mouse at [%d %d]", event.getX(), event.getY()));
		}
		public void mouseEntered(MouseEvent event)
		{
			status.setText(String.format("Your mouse entered at [%d %d]", event.getX(), event.getY()));

		}
		public void mouseExited(MouseEvent event)
		{
			status.setText(String.format("Your Mouse exited at [%d %d]", event.getX(), event.getY()));
	
		}
		public void mouseDragged(MouseEvent event)
		{
			status.setText(String.format("You Dragged the Mouse starting at [%d %d]", event.getX(), event.getY()));
		}
		public void mouseMoved(MouseEvent event)
		{
			status.setText(String.format("You moved the mouse") );
		}
	}

}
