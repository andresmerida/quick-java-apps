package core;

public final record Appointment(String patiendId, String doctorName, String date) implements Service {}
