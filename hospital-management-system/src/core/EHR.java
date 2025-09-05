package core;

import java.util.List;

/**
 * New feature: Electronic Health Records (EHR)
 */
public final record EHR(String patientId, List<String> medicalHistoryList, List<String> prescriptions) implements Service {}
