package jsft.model;

public class Draft {
    private String contractid;

    private String bank;

    private String certificate;

    private String currency;

    private Double draftamount;

    private Double draftrate;

    private Integer draftdeadline;

    private Double rmb;

    private String loandate;

    private String refunddate;

    private Double lockamount;

    private Double lockrate;

    private String businessdeptapply;

    private String financialdeptapply;

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid == null ? null : contractid.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Double getDraftamount() {
        return draftamount;
    }

    public void setDraftamount(Double draftamount) {
        this.draftamount = draftamount;
    }

    public Double getDraftrate() {
        return draftrate;
    }

    public void setDraftrate(Double draftrate) {
        this.draftrate = draftrate;
    }

    public Integer getDraftdeadline() {
        return draftdeadline;
    }

    public void setDraftdeadline(Integer draftdeadline) {
        this.draftdeadline = draftdeadline;
    }

    public Double getRmb() {
        return rmb;
    }

    public void setRmb(Double rmb) {
        this.rmb = rmb;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate == null ? null : loandate.trim();
    }

    public String getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(String refunddate) {
        this.refunddate = refunddate == null ? null : refunddate.trim();
    }

    public Double getLockamount() {
        return lockamount;
    }

    public void setLockamount(Double lockamount) {
        this.lockamount = lockamount;
    }

    public Double getLockrate() {
        return lockrate;
    }

    public void setLockrate(Double lockrate) {
        this.lockrate = lockrate;
    }

    public String getBusinessdeptapply() {
        return businessdeptapply;
    }

    public void setBusinessdeptapply(String businessdeptapply) {
        this.businessdeptapply = businessdeptapply == null ? null : businessdeptapply.trim();
    }

    public String getFinancialdeptapply() {
        return financialdeptapply;
    }

    public void setFinancialdeptapply(String financialdeptapply) {
        this.financialdeptapply = financialdeptapply == null ? null : financialdeptapply.trim();
    }
}