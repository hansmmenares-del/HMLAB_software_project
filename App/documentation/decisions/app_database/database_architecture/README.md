DATABASE ARCHITECTURE
1) Have a good relational model before implementing the interface.

Proposed relational model (example)
    CLIENT
        client_id [PK],
        name,
        tax_id,
        contact,
        address
    PATIENT
        patient_id [PK],
        client_id [FK],
        workorder_id / workentry_id [FK]
        name,
        reference
    WORK_TYPE
        work_type_id,
        name,
        description
    CLIENT_PRICING
        client_id,
        work_type_id,
        unit_price,
        valid_from,
        valid_to
    WORKORDER / WORKENTRY
        work_id,
        client_id,
        patient_id,
        work_type_id,
        quantity,
        unit_price_snapshot,
        status,
        timestamps
    INVOICE / INVOICELINE
        invoice_id,
        client_id,
        issue_date,
        total,
        status,
        work references,
        price snapshots
    PAYMENT
        payment_id,
        invoice_id,
        amount,
        payment_date,
        payment_method
    USER / ROLE
        Authentication and permissions
    AUDIT_LOG
        Who changed what and when
    
