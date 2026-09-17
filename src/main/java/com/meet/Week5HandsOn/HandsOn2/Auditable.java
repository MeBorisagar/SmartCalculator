package com.meet.Week5HandsOn.HandsOn2;

public interface Auditable {

    default String auditPrefix() {
        return "[AUDIT] ";
    }

    String auditSummary();
}

