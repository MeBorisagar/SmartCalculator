package com.meet.assessment;

public interface Auditable {

    default String getAuditPrefix() {
        return "[AUDIT] ";
    }

    String getAuditLog();
}