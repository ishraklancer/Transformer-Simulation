import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;


import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class TGui implements ActionListener{

	private JFrame frame;
	private JTextField primaryVoltageField;
	private JTextField primaryWindingField;
	private JButton btnNewButton;
	private JLabel secondaryVoltageLabel;
	private JLabel lblPrivoltage;
	private JLabel lblPriwinding;
	private JLabel lblSecwinding;
	private JTextField secondaryWindingField;
	private JLabel lblCoreMaterial;
	private JComboBox coreMaterialChoice;
	private JTextField coreLengthField;
	private JTextField coreWidthField;
	private JComboBox windingMaterialChoice;
	private JLabel lblInput;
	private JTextField loadResistanceField;
	private JLabel primaryCurrentLabel;
	private JLabel secondaryCurrentLabel;
	private JLabel coreLossLabel;
	private JLabel copperLossLabel;
	private JTextField secondaryVoltageField;
	private JTextField primaryCurrentField;
	private JTextField secondaryCurrentField;
	private JTextField coreLossField;
	private JTextField copperLossField;
	private JLabel lblViVi;
	private JTextField voltageRegulationField;
	private JLabel label_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TGui window = new TGui();
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
	public TGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("TransformerSim 2.02");
		frame.setBounds(100, 100, 763, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		primaryVoltageField = new JTextField();
		primaryVoltageField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		primaryVoltageField.setBounds(157, 273, 86, 20);
		frame.getContentPane().add(primaryVoltageField);
		primaryVoltageField.setColumns(10);
		
		primaryWindingField = new JTextField();
		primaryWindingField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		primaryWindingField.setBounds(157, 299, 86, 20);
		frame.getContentPane().add(primaryWindingField);
		primaryWindingField.setColumns(10);
		
		secondaryWindingField = new JTextField();
		secondaryWindingField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		secondaryWindingField.setBounds(157, 321, 86, 20);
		frame.getContentPane().add(secondaryWindingField);
		secondaryWindingField.setColumns(10);
		
		secondaryVoltageLabel = new JLabel("Secondary Voltage:");
		secondaryVoltageLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		secondaryVoltageLabel.setBounds(284, 276, 143, 14);
		frame.getContentPane().add(secondaryVoltageLabel);
		
		lblPrivoltage = new JLabel("Primary Voltage: ");
		lblPrivoltage.setBounds(20, 276, 127, 14);
		frame.getContentPane().add(lblPrivoltage);
		
		lblPriwinding = new JLabel("Primary Winding Np: ");
		lblPriwinding.setBounds(20, 301, 127, 14);
		frame.getContentPane().add(lblPriwinding);
		
		lblSecwinding = new JLabel("Secondary Winding Ns");
		lblSecwinding.setBounds(20, 327, 132, 14);
		frame.getContentPane().add(lblSecwinding);
		
		lblCoreMaterial = new JLabel("Core Material");
		lblCoreMaterial.setBounds(20, 350, 127, 14);
		frame.getContentPane().add(lblCoreMaterial);
		
		coreMaterialChoice = new JComboBox();
		coreMaterialChoice.setModel(new DefaultComboBoxModel(new String[] {"Silicon", "Supermendur"}));
		coreMaterialChoice.setBounds(157, 347, 86, 20);
		frame.getContentPane().add(coreMaterialChoice);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(277, 103, 0, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblLl = new JLabel("ll");
		lblLl.setBounds(110, 0, 513, 209);
		lblLl.setIcon(new ImageIcon("C:\\Users\\Ishrak\\Desktop\\trans1.gif"));
		frame.getContentPane().add(lblLl);
		
		JLabel lblWindingMaterial = new JLabel("Winding Material");
		lblWindingMaterial.setBounds(20, 373, 127, 14);
		frame.getContentPane().add(lblWindingMaterial);
		
		JLabel lblCoreLength = new JLabel("Core Length");
		lblCoreLength.setBounds(20, 398, 117, 14);
		frame.getContentPane().add(lblCoreLength);
		
		coreLengthField = new JTextField();
		coreLengthField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		coreLengthField.setBounds(157, 395, 86, 20);
		frame.getContentPane().add(coreLengthField);
		coreLengthField.setColumns(10);
		
		JLabel lblCoreWidth = new JLabel("Core Width");
		lblCoreWidth.setBounds(20, 419, 127, 14);
		frame.getContentPane().add(lblCoreWidth);
		
		windingMaterialChoice = new JComboBox();
		windingMaterialChoice.setBounds(157, 370, 86, 20);
		frame.getContentPane().add(windingMaterialChoice);
		windingMaterialChoice.addItem("Copper");
		windingMaterialChoice.addItem("Aluminium");
		
		coreWidthField = new JTextField();
		coreWidthField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		coreWidthField.setBounds(157, 415, 86, 20);
		frame.getContentPane().add(coreWidthField);
		coreWidthField.setColumns(10);
		
		lblInput = new JLabel("INPUT");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInput.setForeground(new Color(64, 64, 64));
		lblInput.setBounds(20, 251, 68, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblLoadResistanceRs = new JLabel("Load Resistance Rs");
		lblLoadResistanceRs.setBounds(20, 444, 117, 14);
		frame.getContentPane().add(lblLoadResistanceRs);
		
		loadResistanceField = new JTextField();
		loadResistanceField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		loadResistanceField.setBounds(157, 441, 86, 20);
		frame.getContentPane().add(loadResistanceField);
		loadResistanceField.setColumns(10);
		
		JLabel lblOutput = new JLabel("OUTPUT");
		lblOutput.setForeground(Color.DARK_GRAY);
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOutput.setBounds(284, 251, 95, 14);
		frame.getContentPane().add(lblOutput);
		
		primaryCurrentLabel = new JLabel("Primary Current:");
		primaryCurrentLabel.setBounds(284, 301, 154, 14);
		frame.getContentPane().add(primaryCurrentLabel);
		
		secondaryCurrentLabel = new JLabel("Secondary Current:");
		secondaryCurrentLabel.setBounds(284, 324, 154, 14);
		frame.getContentPane().add(secondaryCurrentLabel);
		
		coreLossLabel = new JLabel("Core Loss:");
		coreLossLabel.setBounds(284, 350, 143, 14);
		frame.getContentPane().add(coreLossLabel);
		
		copperLossLabel = new JLabel("Copper Loss:");
		copperLossLabel.setBounds(284, 373, 131, 14);
		frame.getContentPane().add(copperLossLabel);
		
		secondaryVoltageField = new JTextField();
		secondaryVoltageField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		secondaryVoltageField.setEditable(false);
		secondaryVoltageField.setBounds(424, 273, 143, 20);
		frame.getContentPane().add(secondaryVoltageField);
		secondaryVoltageField.setColumns(10);
		
		primaryCurrentField = new JTextField();
		primaryCurrentField.setEditable(false);
		primaryCurrentField.setBounds(424, 298, 143, 20);
		frame.getContentPane().add(primaryCurrentField);
		primaryCurrentField.setColumns(10);
		
		secondaryCurrentField = new JTextField();
		secondaryCurrentField.setEditable(false);
		secondaryCurrentField.setBounds(424, 321, 143, 20);
		frame.getContentPane().add(secondaryCurrentField);
		secondaryCurrentField.setColumns(10);
		
		coreLossField = new JTextField();
		coreLossField.setEditable(false);
		coreLossField.setBounds(424, 347, 143, 20);
		frame.getContentPane().add(coreLossField);
		coreLossField.setColumns(10);
		
		copperLossField = new JTextField();
		copperLossField.setEditable(false);
		copperLossField.setBounds(425, 373, 142, 20);
		frame.getContentPane().add(copperLossField);
		copperLossField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(146, 331, 10, 10);
		frame.getContentPane().add(panel_1);
		
		btnNewButton = new JButton("Compute");
		btnNewButton.setBounds(177, 487, 86, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(310, 487, 105, 23);
		frame.getContentPane().add(btnClear);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(248, 419, 15, 14);
		frame.getContentPane().add(lblM);
		
		JLabel label = new JLabel("m");
		label.setBounds(248, 398, 15, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u03A9");
		label_1.setBounds(248, 444, 15, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblV = new JLabel("V");
		lblV.setBounds(248, 276, 15, 14);
		frame.getContentPane().add(lblV);
		
		JLabel lblV_1 = new JLabel("V\r\n");
		lblV_1.setBounds(577, 276, 15, 14);
		frame.getContentPane().add(lblV_1);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(577, 302, 15, 14);
		frame.getContentPane().add(lblA);
		
		JLabel lblA_1 = new JLabel("A");
		lblA_1.setBounds(577, 324, 15, 14);
		frame.getContentPane().add(lblA_1);
		
		JLabel lblW = new JLabel("W");
		lblW.setBounds(577, 350, 15, 14);
		frame.getContentPane().add(lblW);
		
		JLabel lblW_1 = new JLabel("W");
		lblW_1.setBounds(577, 373, 15, 14);
		frame.getContentPane().add(lblW_1);
		
		lblViVi = new JLabel("Voltage Regulation");
		lblViVi.setBounds(284, 419, 117, 14);
		frame.getContentPane().add(lblViVi);
		
		voltageRegulationField = new JTextField();
		voltageRegulationField.setEditable(false);
		voltageRegulationField.setBounds(424, 416, 143, 20);
		frame.getContentPane().add(voltageRegulationField);
		voltageRegulationField.setColumns(10);
		
		label_2 = new JLabel("%");
		label_2.setBounds(577, 419, 15, 14);
		frame.getContentPane().add(label_2);
		
		
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				primaryVoltageField.setText(null);
				primaryWindingField.setText(null);
				secondaryWindingField.setText(null);
				coreLengthField.setText(null);
				coreWidthField.setText(null);
				loadResistanceField.setText(null);
				secondaryVoltageField.setText(null);
				primaryCurrentField.setText(null);
				secondaryCurrentField.setText(null);
				coreLossField.setText(null);
				copperLossField.setText(null);
				
			}
		});
	
		
	}
	
	public void actionPerformed(ActionEvent event){
		
		String v1text = primaryVoltageField.getText();
		String n1text = primaryWindingField.getText();
		String n2text = secondaryWindingField.getText();
		String coreLengthText = coreLengthField.getText();
		String coreWidthText  = coreWidthField.getText();
		String coreMaterial = (String)coreMaterialChoice.getSelectedItem();
		String windingMaterial = (String)windingMaterialChoice.getSelectedItem();
		String loadResistance = loadResistanceField.getText();
		
		
		double V1 = Double.parseDouble(v1text);
		double n1 = Double.parseDouble(n1text);
		double n2 = Double.parseDouble(n2text);
		double coreLength = Double.parseDouble(coreLengthText);
		double coreWidth = Double.parseDouble(coreWidthText);
		double perimeter = 2 * (coreWidth + coreLength);
		
		
		
		double miu = 1500, K = 0.0059700, m = 1.260, n = 1.730;
		if (coreMaterial == "Supermendur"){
			miu = 800;
			K = 0.0236000;
			m = 1.050;
			n = 1.300;
		}
		
		
		
		
		
		double Pr = 0.033 , Px = 0.0;
		if (windingMaterial == "Copper"){
			Pr = 0.033;
		}
		else if (windingMaterial == "Aluminium"){
			Pr = 0.054;
		}
	
		Px = 0.02 * Pr;
		
		
		
		double Ri = perimeter * Pr * n1;
		double R2 = perimeter * Pr * n2;
		double Xi = perimeter * Px * n1;
		double X2 = perimeter * Px * n2;
		
		double k = n1 / n2;
		
		double R1 = k * k * R2;
		double R0 = Ri - R1;
		double X1 = k * k * Px;
		double X0 = Xi - X1;
		
		double R2_ = R1, X2_ = X1;
		double R_eq = R1 + R2_;
		double X_eq = X1 + X2_;
		double Z_eq = Math.sqrt((R_eq*R_eq) + (X_eq*X_eq));
		double RL = Double.parseDouble(loadResistance);
		
		double V2_ = ((RL / (Z_eq + RL)) * V1);
		double V2 = V2_ / k;
		
		double I2 = V2 / RL;
		double Zi = Math.sqrt(Ri*Ri + Xi*Xi);
		double I1 = I2 / k;
		
		double copperLoss = Math.pow(I1,2)*R1 + Math.pow(I2,2)*R2;
		
		double f = 50;
		double B = 1.2;
		double coreLoss = K * Math.pow(50, m) * Math.pow(B, n);
		
		secondaryVoltageField.setText(""+V2);
		primaryCurrentField.setText(""+I1);
		secondaryCurrentField.setText(""+I2);
		coreLossField.setText(""+coreLoss);
		copperLossField.setText(""+copperLoss);
		
		//full load calculation
			
			double V2Full_ = ((99999999 / (Z_eq + 99999999)) * V1);
			double V2Full = V2Full_ / k;
		
		double vr = ((V2-V2Full)/V2Full) * 100;
		voltageRegulationField.setText(""+vr);
		
	}
}
