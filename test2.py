import pandas as pd

file_path = "/Users/MSI/Downloads/Employees.csv"

try:
    data = pd.read_csv(file_path)
except FileNotFoundError:
    print("File not found. Check path.")
    exit()

data_cleaned = data.drop_duplicates().copy()

data_cleaned['Age'] = data_cleaned['Age'].astype(int)

conversion_rate = 48.55
data_cleaned['Salary(EGP)'] = data_cleaned['Salary(USD)'] * conversion_rate

data_cleaned.drop(columns=['Salary(USD)'], inplace=True)

average_age = data_cleaned['Age'].mean()
median_salary = data_cleaned['Salary(EGP)'].median()
gender_ratio = data_cleaned['Gender'].value_counts(normalize=True)

print(f"Average age: {average_age:.1f}")
print(f"Median salary in Egyptian pounds: {median_salary:,.0f}")
print(gender_ratio.apply(lambda x: f"{x:.1%}").to_string(index=True))

output_file_path = "Employees_Cleaned.csv"
data_cleaned.to_csv(output_file_path, index=False, float_format='%.2f')
print(f"The modified data is saved in a file: {output_file_path}")
