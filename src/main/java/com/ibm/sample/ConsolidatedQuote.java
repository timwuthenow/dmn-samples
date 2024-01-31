package com.ibm.sample;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsolidatedQuote {
    @JsonProperty("dp_ds_match_id")
    private String dp_ds_match_id;
    @JsonProperty("buid")
    private String buid;
        @JsonProperty("rel number")
    private String rel_number;
        @JsonProperty("rel name")
    private String rel_name;
        @JsonProperty("cust id")
    private String cust_id;
        @JsonProperty("crs")
    private String crs;
        @JsonProperty("anzsic code")
    private String anzsic_code;
        @JsonProperty("account id")
    private String account_id;
        @JsonProperty("product type")
    private String product_type;
        @JsonProperty("product variant")
    private String product_variant;
        @JsonProperty("lcc")
    private String lcc;
        @JsonProperty("fac limit sought")
    private BigDecimal fac_limit_sought;
        @JsonProperty("term month")
    private Integer term_month;
        @JsonProperty("Sought tot drawn margin")
    private BigDecimal sought_tot_drawn_margin;
        @JsonProperty("Sought Tot undrawn margin")
    private BigDecimal sought_tot_undrawn_margin;
        @JsonProperty("Sought Service Fee Per Freq")
    private BigDecimal sought_service_fee_per_freq;

    
    public ConsolidatedQuote() {
    }

    

    public ConsolidatedQuote(String dp_ds_match_id, String buid, String rel_number, String rel_name, String cust_id,
            String crs, String anzsic_code, String account_id, String product_type, String product_variant, String lcc,
            BigDecimal fac_limit_sought, Integer term_month, BigDecimal sought_tot_drawn_margin,
            BigDecimal sought_tot_undrawn_margin, BigDecimal sought_service_fee_per_freq) {
        this.dp_ds_match_id = dp_ds_match_id;
        this.buid = buid;
        this.rel_number = rel_number;
        this.rel_name = rel_name;
        this.cust_id = cust_id;
        this.crs = crs;
        this.anzsic_code = anzsic_code;
        this.account_id = account_id;
        this.product_type = product_type;
        this.product_variant = product_variant;
        this.lcc = lcc;
        this.fac_limit_sought = fac_limit_sought;
        this.term_month = term_month;
        this.sought_tot_drawn_margin = sought_tot_drawn_margin;
        this.sought_tot_undrawn_margin = sought_tot_undrawn_margin;
        this.sought_service_fee_per_freq = sought_service_fee_per_freq;
    }



    public String getDp_ds_match_id() {
        return dp_ds_match_id;
    }
    public void setDp_ds_match_id(String dp_ds_match_id) {
        this.dp_ds_match_id = dp_ds_match_id;
    }
    public String getBuid() {
        return buid;
    }
    public void setBuid(String buid) {
        this.buid = buid;
    }
    public String getRel_number() {
        return rel_number;
    }
    public void setRel_number(String rel_number) {
        this.rel_number = rel_number;
    }
    public String getRel_name() {
        return rel_name;
    }
    public void setRel_name(String rel_name) {
        this.rel_name = rel_name;
    }
    public String getCust_id() {
        return cust_id;
    }
    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }
    public String getCrs() {
        return crs;
    }
    public void setCrs(String crs) {
        this.crs = crs;
    }
    public String getAnzsic_code() {
        return anzsic_code;
    }
    public void setAnzsic_code(String anzsic_code) {
        this.anzsic_code = anzsic_code;
    }
    public String getAccount_id() {
        return account_id;
    }
    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }
    public String getProduct_type() {
        return product_type;
    }
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
    public String getProduct_variant() {
        return product_variant;
    }
    public void setProduct_variant(String product_variant) {
        this.product_variant = product_variant;
    }
    public String getLcc() {
        return lcc;
    }
    public void setLcc(String lcc) {
        this.lcc = lcc;
    }
    public BigDecimal getFac_limit_sought() {
        return fac_limit_sought;
    }
    public void setFac_limit_sought(BigDecimal fac_limit_sought) {
        this.fac_limit_sought = fac_limit_sought;
    }
    public Integer getTerm_month() {
        return term_month;
    }
    public void setTerm_month(Integer term_month) {
        this.term_month = term_month;
    }
    public BigDecimal getSought_tot_drawn_margin() {
        return sought_tot_drawn_margin;
    }
    public void setSought_tot_drawn_margin(BigDecimal sought_tot_drawn_margin) {
        this.sought_tot_drawn_margin = sought_tot_drawn_margin;
    }
    public BigDecimal getSought_tot_undrawn_margin() {
        return sought_tot_undrawn_margin;
    }
    public void setSought_tot_undrawn_margin(BigDecimal sought_tot_undrawn_margin) {
        this.sought_tot_undrawn_margin = sought_tot_undrawn_margin;
    }
    public BigDecimal getSought_service_fee_per_freq() {
        return sought_service_fee_per_freq;
    }
    public void setSought_service_fee_per_freq(BigDecimal sought_service_fee_per_freq) {
        this.sought_service_fee_per_freq = sought_service_fee_per_freq;
    }


}
