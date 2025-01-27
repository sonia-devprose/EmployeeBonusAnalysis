public class PartTimeEmployee extends EmployeeDetails {
    double part_time_bonus;

    @Override
    double calculateBonus() {
        if (salary < 20000) {
            return part_time_bonus = salary * 0.04;
        } else if (salary <= 40000) {
            return part_time_bonus = salary * 0.09;
        } else {
            return part_time_bonus = salary * 0.1;
        }
    }
}
