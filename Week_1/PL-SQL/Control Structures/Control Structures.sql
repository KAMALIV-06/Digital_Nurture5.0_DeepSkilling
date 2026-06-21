Scenario 1 : Apply 1% Discount to Loan Interest Rates for Customers Above 60

BEGIN
    FOR cust IN (
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('1% Discount Applied Successfully');
END;
/

Scenario 2 : Set VIP Status for Customers with Balance Greater Than 10000

BEGIN
    FOR cust IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP Status Updated Successfully');
END;
/

Scenario 3 : Print Reminders for Loans Due Within Next 30 Days

BEGIN
    FOR loan_rec IN (
        SELECT c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE
                            AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID '
            || loan_rec.LoanID
            || ' for customer '
            || loan_rec.Name
            || ' is due on '
            || TO_CHAR(loan_rec.DueDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/

