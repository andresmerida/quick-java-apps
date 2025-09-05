package core;

public sealed interface Service permits Appointment, Billing, Report, EHR, Inventory {}
