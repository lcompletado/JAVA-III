first_number = float(input("Enter the first number: "))
operator = input("Enter an operator (+, -, *, /): ").strip()
second_number = float(input("Enter the second number: "))

if operator == "+":
    result = first_number + second_number
    print("Result:", result)
elif operator == "-":
    result = first_number - second_number
    print("Result:", result)
elif operator == "*":
    result = first_number * second_number
    print("Result:", result)
elif operator == "/":
    if second_number == 0:
        print("Error: Cannot divide by zero.")
    else:
        result = first_number / second_number
        print("Result:", result)
else:
    print("Error: Unsupported operator.")