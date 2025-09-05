package core;

public final record Billing(String patientId, double amount, String status) implements Service {}
