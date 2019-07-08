package sg.edu.rp.c346.exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView employeeList;
    TextView tvName, tvTitle, tvSalary;
    ArrayList<EmployeeList>employeeInfoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = findViewById(R.id.textViewName);
        tvTitle = findViewById(R.id.textviewTitle);
        tvSalary = findViewById(R.id.textViewSalary);

        employeeList = findViewById(R.id.listEmployee);
        employeeInfoList = new ArrayList<>();

        EmployeeList employee1 = new EmployeeList("John", "Social Technical Leader", 3400.0);
        EmployeeList employee2 = new EmployeeList("Mary", "Programmer", 2200.0);
        employeeInfoList.add(employee1);
        employeeInfoList.add(employee2);

        adapter = new CustomAdapter(this, R.layout.row, employeeInfoList);
        employeeList.setAdapter(adapter);
    }
}