package Variables_LogicsPractice;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankSimulation {

    // =========================================================
    // TRANSACTION CLASS
    // =========================================================

    static class Transaction {

        LocalDate date;
        String description;
        double amount;

        public Transaction(LocalDate date, String description, double amount) {
            this.date = date;
            this.description = description;
            this.amount = amount;
        }
    }


    // =========================================================
    // BANK ACCOUNT CLASS
    // =========================================================

    static class BankAccount {

        // Instance variables
        String accountHolderName;
        int accountNumber;
        String accountCategory;
        double interestRate;
        double openingBalance;

        // List of transactions belonging to this account
        List<Transaction> transactions = new ArrayList<>();


        // Constructor
        public BankAccount(
                String accountHolderName,
                int accountNumber,
                String accountCategory,
                double interestRate,
                double openingBalance) {

            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.accountCategory = accountCategory;
            this.interestRate = interestRate;
            this.openingBalance = openingBalance;
        }


        // ---------------------------------------------------------
        // Add transaction
        // ---------------------------------------------------------

        public void addTransaction(
                LocalDate date,
                String description,
                double amount) {

            transactions.add(
                    new Transaction(date, description, amount)
            );
        }


        // ---------------------------------------------------------
        // Get balance at the end of a particular date
        // ---------------------------------------------------------

        public double getClosingBalance(LocalDate date) {

            double balance = openingBalance;

            for (Transaction transaction : transactions) {

                if (!transaction.date.isAfter(date)) {
                    balance = balance + transaction.amount;
                }
            }

            return balance;
        }


        // ---------------------------------------------------------
        // Calculate monthly interest
        // Daily Product Method
        // ---------------------------------------------------------

        public double calculateMonthlyInterest(YearMonth month) {

            LocalDate firstDay = month.atDay(1);
            LocalDate lastDay = month.atEndOfMonth();

            double dailyProduct = 0;

            LocalDate currentDate = firstDay;

            while (!currentDate.isAfter(lastDay)) {

                double endOfDayBalance =
                        getClosingBalance(currentDate);

                dailyProduct = dailyProduct + endOfDayBalance;

                currentDate = currentDate.plusDays(1);
            }

            /*
             * FY 2026-27 has 365 days.
             *
             * Daily interest:
             *
             * End of Day Balance × Annual Rate / 365
             *
             * For the entire month:
             *
             * Daily Product × Annual Rate / 365
             */

            double monthlyInterest =
                    dailyProduct * (interestRate / 100) / 365;

            return monthlyInterest;
        }


        // ---------------------------------------------------------
        // Calculate total interest for financial year
        // ---------------------------------------------------------

        public double calculateAnnualInterest() {

            double totalInterest = 0;

            YearMonth month =
                    YearMonth.of(2026, 4);

            for (int i = 0; i < 12; i++) {

                totalInterest =
                        totalInterest + calculateMonthlyInterest(month);

                month = month.plusMonths(1);
            }

            return totalInterest;
        }


        // ---------------------------------------------------------
        // Display transaction statement
        // ---------------------------------------------------------

        public void displayStatement() {

            System.out.println();
            System.out.println("==============================================================");
            System.out.println("                    ACCOUNT STATEMENT");
            System.out.println("==============================================================");

            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Category       : " + accountCategory);
            System.out.println("Interest Rate  : " + interestRate + "%");
            System.out.println("Opening Balance: " + format(openingBalance));

            System.out.println();
            System.out.printf(
                    "%-15s %-25s %-15s %-15s%n",
                    "Date",
                    "Description",
                    "Amount",
                    "Balance"
            );

            System.out.println(
                    "----------------------------------------------------------------"
            );

            // Sort transactions according to date
            transactions.sort(
                    Comparator.comparing(t -> t.date)
            );

            double balance = openingBalance;

            for (Transaction transaction : transactions) {

                balance = balance + transaction.amount;

                System.out.printf(
                        "%-15s %-25s %-15s %-15s%n",
                        transaction.date,
                        transaction.description,
                        format(transaction.amount),
                        format(balance)
                );
            }

            System.out.println(
                    "----------------------------------------------------------------"
            );

            System.out.println(
                    "Closing Balance: " + format(balance)
            );
        }


        // ---------------------------------------------------------
        // Display monthly interest
        // ---------------------------------------------------------

        public void displayMonthlyInterest() {

            System.out.println();
            System.out.println("==============================================================");
            System.out.println("                MONTHLY INTEREST REPORT");
            System.out.println("==============================================================");

            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Category       : " + accountCategory);
            System.out.println("Interest Rate  : " + interestRate + "%");

            System.out.println();

            System.out.printf(
                    "%-15s %-18s %-18s %-18s%n",
                    "Month",
                    "Opening Balance",
                    "Closing Balance",
                    "Interest Earned"
            );

            System.out.println(
                    "--------------------------------------------------------------------------"
            );

            YearMonth month =
                    YearMonth.of(2026, 4);

            for (int i = 0; i < 12; i++) {

                LocalDate firstDay = month.atDay(1);
                LocalDate lastDay = month.atEndOfMonth();

                double opening =
                        getClosingBalance(firstDay.minusDays(1));

                double closing =
                        getClosingBalance(lastDay);

                double interest =
                        calculateMonthlyInterest(month);

                System.out.printf(
                        "%-15s %-18s %-18s %-18s%n",
                        month,
                        format(opening),
                        format(closing),
                        format(interest)
                );

                month = month.plusMonths(1);
            }
        }


        // ---------------------------------------------------------
        // Annual summary
        // ---------------------------------------------------------

        public void displayAnnualSummary() {

            double closingBalance =
                    getClosingBalance(
                            LocalDate.of(2027, 3, 31)
                    );

            double totalCredits = 0;
            double totalDebits = 0;

            for (Transaction transaction : transactions) {

                if (transaction.amount > 0) {
                    totalCredits =
                            totalCredits + transaction.amount;
                } else {
                    totalDebits =
                            totalDebits + Math.abs(transaction.amount);
                }
            }

            double totalInterest =
                    calculateAnnualInterest();

            System.out.println();
            System.out.println("==============================================================");
            System.out.println("                     ANNUAL SUMMARY");
            System.out.println("==============================================================");

            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Category       : " + accountCategory);
            System.out.println("Interest Rate  : " + interestRate + "%");

            System.out.println();

            System.out.println(
                    "Opening Balance : " + format(openingBalance)
            );

            System.out.println(
                    "Total Credits   : " + format(totalCredits)
            );

            System.out.println(
                    "Total Debits    : " + format(totalDebits)
            );

            System.out.println(
                    "Interest Earned : " + format(totalInterest)
            );

            System.out.println(
                    "Closing Balance : " + format(closingBalance)
            );
        }
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {

        // =====================================================
        // FINANCIAL YEAR
        // =====================================================

        LocalDate financialYearStart =
                LocalDate.of(2026, 4, 1);

        LocalDate financialYearEnd =
                LocalDate.of(2027, 3, 31);


        System.out.println(
                "Financial Year: "
                        + financialYearStart
                        + " to "
                        + financialYearEnd
        );


        // =====================================================
        // ACCOUNT 1 - SENIOR CITIZEN
        // =====================================================

        BankAccount account1 =
                new BankAccount(
                        "Karthik",
                        1001,
                        "Senior Citizen",
                        4.00,
                        200000
                );


        // Pension and withdrawals

        account1.addTransaction(
                LocalDate.of(2026, 4, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 4, 15),
                "Medical Expense",
                -15000
        );

        account1.addTransaction(
                LocalDate.of(2026, 5, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 5, 20),
                "Household Expense",
                -10000
        );

        account1.addTransaction(
                LocalDate.of(2026, 6, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 7, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 7, 15),
                "Medical Expense",
                -20000
        );

        account1.addTransaction(
                LocalDate.of(2026, 8, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 9, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 10, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 11, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2026, 12, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2027, 1, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2027, 2, 5),
                "Pension Credit",
                40000
        );

        account1.addTransaction(
                LocalDate.of(2027, 3, 5),
                "Pension Credit",
                40000
        );


        // =====================================================
        // ACCOUNT 2 - EX SERVICEMAN
        // =====================================================

        BankAccount account2 =
                new BankAccount(
                        "Venkat",
                        1002,
                        "Ex Serviceman",
                        3.75,
                        150000
                );


        account2.addTransaction(
                LocalDate.of(2026, 4, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 4, 10),
                "Household Expense",
                -12000
        );

        account2.addTransaction(
                LocalDate.of(2026, 4, 25),
                "Utility Bills",
                -8000
        );

        account2.addTransaction(
                LocalDate.of(2026, 5, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 5, 12),
                "Household Expense",
                -10000
        );

        account2.addTransaction(
                LocalDate.of(2026, 6, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 6, 20),
                "Utility Bills",
                -7000
        );

        account2.addTransaction(
                LocalDate.of(2026, 7, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 8, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 9, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 10, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 11, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2026, 12, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2027, 1, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2027, 2, 1),
                "Pension Credit",
                35000
        );

        account2.addTransaction(
                LocalDate.of(2027, 3, 1),
                "Pension Credit",
                35000
        );


        // =====================================================
        // ACCOUNT 3 - BUSINESS PERSON
        // =====================================================

        BankAccount account3 =
                new BankAccount(
                        "Rahul",
                        1003,
                        "Normal",
                        3.00,
                        300000
                );


        // April - irregular business transactions

        account3.addTransaction(
                LocalDate.of(2026, 4, 3),
                "Business Receipt",
                75000
        );

        account3.addTransaction(
                LocalDate.of(2026, 4, 7),
                "Supplier Payment",
                -45000
        );

        account3.addTransaction(
                LocalDate.of(2026, 4, 12),
                "Business Receipt",
                120000
        );

        account3.addTransaction(
                LocalDate.of(2026, 4, 18),
                "Supplier Payment",
                -80000
        );

        account3.addTransaction(
                LocalDate.of(2026, 4, 25),
                "Business Receipt",
                50000
        );

        account3.addTransaction(
                LocalDate.of(2026, 4, 28),
                "Cash Withdrawal",
                -25000
        );


        // May

        account3.addTransaction(
                LocalDate.of(2026, 5, 4),
                "Business Receipt",
                90000
        );

        account3.addTransaction(
                LocalDate.of(2026, 5, 10),
                "Supplier Payment",
                -100000
        );

        account3.addTransaction(
                LocalDate.of(2026, 5, 21),
                "Business Receipt",
                150000
        );


        // June

        account3.addTransaction(
                LocalDate.of(2026, 6, 2),
                "Business Receipt",
                60000
        );

        account3.addTransaction(
                LocalDate.of(2026, 6, 8),
                "Supplier Payment",
                -75000
        );

        account3.addTransaction(
                LocalDate.of(2026, 6, 22),
                "Business Receipt",
                180000
        );

        account3.addTransaction(
                LocalDate.of(2026, 6, 27),
                "Cash Withdrawal",
                -50000
        );


        // July

        account3.addTransaction(
                LocalDate.of(2026, 7, 5),
                "Business Receipt",
                110000
        );

        account3.addTransaction(
                LocalDate.of(2026, 7, 15),
                "Supplier Payment",
                -90000
        );

        account3.addTransaction(
                LocalDate.of(2026, 7, 28),
                "Business Receipt",
                80000
        );


        // August

        account3.addTransaction(
                LocalDate.of(2026, 8, 3),
                "Business Receipt",
                140000
        );

        account3.addTransaction(
                LocalDate.of(2026, 8, 18),
                "Supplier Payment",
                -120000
        );


        // September

        account3.addTransaction(
                LocalDate.of(2026, 9, 5),
                "Business Receipt",
                200000
        );

        account3.addTransaction(
                LocalDate.of(2026, 9, 15),
                "Supplier Payment",
                -150000
        );


        // October

        account3.addTransaction(
                LocalDate.of(2026, 10, 8),
                "Business Receipt",
                95000
        );

        account3.addTransaction(
                LocalDate.of(2026, 10, 20),
                "Cash Withdrawal",
                -60000
        );


        // November

        account3.addTransaction(
                LocalDate.of(2026, 11, 2),
                "Business Receipt",
                160000
        );

        account3.addTransaction(
                LocalDate.of(2026, 11, 19),
                "Supplier Payment",
                -110000
        );


        // December

        account3.addTransaction(
                LocalDate.of(2026, 12, 5),
                "Business Receipt",
                250000
        );

        account3.addTransaction(
                LocalDate.of(2026, 12, 20),
                "Supplier Payment",
                -200000
        );


        // January

        account3.addTransaction(
                LocalDate.of(2027, 1, 10),
                "Business Receipt",
                180000
        );

        account3.addTransaction(
                LocalDate.of(2027, 1, 25),
                "Supplier Payment",
                -125000
        );


        // February

        account3.addTransaction(
                LocalDate.of(2027, 2, 3),
                "Business Receipt",
                220000
        );

        account3.addTransaction(
                LocalDate.of(2027, 2, 18),
                "Supplier Payment",
                -160000
        );


        // March

        account3.addTransaction(
                LocalDate.of(2027, 3, 5),
                "Business Receipt",
                300000
        );

        account3.addTransaction(
                LocalDate.of(2027, 3, 20),
                "Supplier Payment",
                -220000
        );


        // =====================================================
        // DISPLAY EVERYTHING
        // =====================================================

        account1.displayStatement();
        account1.displayMonthlyInterest();
        account1.displayAnnualSummary();


        account2.displayStatement();
        account2.displayMonthlyInterest();
        account2.displayAnnualSummary();


        account3.displayStatement();
        account3.displayMonthlyInterest();
        account3.displayAnnualSummary();
    }


    // =========================================================
    // FORMAT MONEY
    // =========================================================

    public static String format(double amount) {

        return String.format("₹%,.2f", amount);
    }
}