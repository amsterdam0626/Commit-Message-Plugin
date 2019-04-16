package com.rmondjone.commit;

import com.intellij.openapi.project.Project;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CommitPannel {

    Project project;

    /**
     * 提交类型
     */
    private JComboBox mTypeComboBox;
    /**
     * 设计版本号
     */
    private JTextField mVersionField;
    /**
     * 简要描述
     */
    private JTextField mSimpleField;
    /**
     * 详细描述
     */
    private JTextArea mDetailField;
    /**
     * 弹框主面板
     */
    private JPanel mainPanel;

    public CommitPannel(Project project) {
        for (ChangeType type : ChangeType.values()) {
            mTypeComboBox.addItem(type);
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public CommitMessage getCommitMessage() {
        return new CommitMessage(
                (ChangeType) mTypeComboBox.getSelectedItem(),
                mVersionField.getText().trim(),
                mSimpleField.getText().trim(),
                mDetailField.getText().trim());
    }
}
