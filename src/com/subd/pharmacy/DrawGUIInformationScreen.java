package com.subd.pharmacy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DrawGUIInformationScreen {

	public DrawGUIInformationScreen(Display display) {

		Shell shell = new Shell(display);
		shell.setSize(600, 400);
		shell.setText("Information Screen");

		centerShell(shell);
		
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite1 = new Composite(shell, SWT.NONE);
		
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 2;
		
		composite1.setLayout(gridLayout1);
		
		Composite composite11 = new Composite(composite1, SWT.NONE);
		
		GridLayout gridLayout11 = new GridLayout();
		gridLayout11.numColumns = 2;
		gridLayout11.horizontalSpacing = 5;
		
		composite11.setLayout(gridLayout11);
			
		Label productLabel = new Label(composite11, SWT.NONE);
		productLabel.setText("Product: ");
		
		Combo combo = new Combo(composite11, SWT.READ_ONLY);
		combo.add("Product 1");
		combo.add("Product 2");
		combo.add("Product 3");
		combo.add("Product 4");
			
		Composite composite12 = new Composite(composite1, SWT.NONE);
		composite12.setLayout(new FillLayout(SWT.VERTICAL));
		
		Button search = new Button(composite12, SWT.PUSH);
		search.setText("Search!");
		
		Button addProduct = new Button(composite12, SWT.PUSH);		
		addProduct.setText("Add new product");		
		
		Composite composite2 = new Composite(shell, SWT.NULL);
		
		RowLayout rowLayout2 = new RowLayout();
		rowLayout2.marginLeft = 10;
		rowLayout2.marginTop = 5;
		rowLayout2.marginRight = 5;
		rowLayout2.marginBottom = 5;
		
		composite2.setLayout(rowLayout2);
		
		Label nameLabel = new Label(composite2, SWT.NONE);
		nameLabel.setText("Name: ");
		
		Text nameText = new Text(composite2, SWT.READ_ONLY);
		
		Composite composite3 = new Composite(shell, SWT.NULL);
		
		composite3.setLayout(rowLayout2);
		
		Label descriptionLabel = new Label(composite3, SWT.NONE);
		descriptionLabel.setText("Description: ");
		
		Text descriptionText = new Text(composite3, SWT.READ_ONLY);
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public void centerShell(Shell shell) {

		Rectangle bds = shell.getDisplay().getBounds();
		Point p = shell.getSize();

		int nLeft = (bds.width - p.x) / 2;
		int nTop = (bds.height - p.y) / 2;

		shell.setBounds(nLeft, nTop, p.x, p.y);

	}

}
