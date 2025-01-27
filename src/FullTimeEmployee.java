public class FullTimeEmployee extends EmployeeDetails {

    double fulltime_bonus;

@Override
double calculateBonus()
{
    if (salary < 40000)
    {
       return fulltime_bonus = salary * 0.05;
    }
    else if (salary <= 80000)
    {
        return fulltime_bonus = salary * 0.10;
    }
    else
    {
       return fulltime_bonus = salary * 0.15;
    }



}
}
