package com.meet.w5;

public interface Auditable {

    default String auditPrefix() {
        return "[AUDIT] ";
    }

    String auditSummary();
}

