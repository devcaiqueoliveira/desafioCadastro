package src;

import src.form.ReadAnswers;
import src.form.ReadForm;
import src.form.ResponseLog;
import src.form.RunForm;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new RunForm(new ReadForm(), new ReadAnswers(), new ResponseLog()).executeForm();
    }
}