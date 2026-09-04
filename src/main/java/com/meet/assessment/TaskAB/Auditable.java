package com.meet.assessment.TaskAB;

public interface Auditable {

    default String getAuditPrefix() {
        return "[AUDIT] ";
    }

    String getAuditLog();
}