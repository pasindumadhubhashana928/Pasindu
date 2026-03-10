# Pasindu
This Java program records student information and determines their scholarship eligibility based on marks and family income.

## Features

- Input student **name**, **marks**, and **monthly family income**.
- Validates marks to ensure they are between 0 and 100.
- Determines scholarship category:
  - **Full Scholarship** – Marks: 85-100 & Income < 100,000
  - **Half Scholarship** – Marks: 70-84 & Income < 150,000
  - **Partial Scholarship** – Marks: 55-69
  - **Not Eligible** – Marks < 55 or income criteria not met
- Displays student details and scholarship category.
- Counts total students eligible for scholarship.

## How to Run

1. Clone or download the repository.
2. Compile the Java program:
   ```bash
   javac Student.java
