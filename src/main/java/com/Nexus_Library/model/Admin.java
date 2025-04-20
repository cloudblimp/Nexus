package com.Nexus_Library.model;

import java.sql.Timestamp;

public class Admin extends User {
    public Admin(int userId, String firstName, String lastName, String email, String password,
                 Timestamp registrationDate) {
        super(userId, firstName, lastName, email, password, registrationDate, "Admin");
    }

    @Override
    public int getBorrowLimit() {
        return 0; // Admins don’t borrow, they manage
    }

    @Override
    public boolean canAccessResearchPapers() {
        return true; // Admins can access everything
    }
}