/**
 * ������� "���������" ��� ������ ������� ��������. ���� ����
 *  ��� ����� ������ �� ������, �� �������������� ���������� ��������
 *   � ����, ����� ������� ������:"������ ������� �����!"
 */
countButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0)
result.setText("���������� ��������: " + area.getText().length() + ". ���������� ����: " + area.getText().trim().split("\\s+").length);
else
result.setText("������ ������� �����!");
 }
});
/**
 * ������� "���������" ��� ������ ��������. ��� ��������� �������
 * ���� ��� ����� ������
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
