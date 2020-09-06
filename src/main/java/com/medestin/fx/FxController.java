package com.medestin.fx;

import com.medestin.checker.PalindromeChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FxController {
    @FXML
    private TextField palindromeTextField;

    @FXML
    private Text palindromeResult;

    private final PalindromeChecker palindromeChecker;

    public FxController() {
        palindromeChecker = new PalindromeChecker();
    }

    public void checkForThePalindrome(ActionEvent actionEvent) {
        String palindrome = palindromeTextField.getText();
        boolean result = palindromeChecker.isPalindrome(palindrome);
        String not = result ? "" : "not";
        String resultText = String.format("\"" + palindrome + "\" is %s a palindrome.", not);

        palindromeResult.setText(resultText);
    }
}
