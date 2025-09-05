package core;

public record Patient(String id, String name, int age, String ailment) implements User {}
