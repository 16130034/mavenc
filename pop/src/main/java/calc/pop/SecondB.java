/**
 * ������� "���������" ��� ������ ������� ��������� ������
 */
resButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0);
/**
 * ������ � ���������� ���� �����, ����������� � Double
*/
Double summ1a = Double.valueOf(obyem.getText());
/**
 * ������ � ���������� ���� �����, ����������� � Double
 */
Double a = Double.valueOf(summa.getText());
a = a*(summ1a/100);
/**
 *  ����� ������� ���������� � ��������� ����
 */
resultS.setText(a.toString());
}
});
/**
 *  ������� "���������" ��� ������ ��������. ���
 *   ��������� ������� ���� ��� ����� ������
 */
ochistButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
area.setText(null);
}
});
/**
 *  ������� "���������" ��� ������ ������
 */
exitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
}
}
}
