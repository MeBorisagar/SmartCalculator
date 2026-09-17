package com.meet.Biweekly3;

public interface Auditable {

    default String getAuditPrefix() {
        return "[AUDIT] ";
    }

    String getAuditLog();
}