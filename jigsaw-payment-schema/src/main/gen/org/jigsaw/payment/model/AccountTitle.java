// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package org.jigsaw.payment.model;

/**
 * <pre>
 **
 * 会计科目号, 注意，会计科目号设置影响账号ID生成策略。
 * 默认的，采用七位会计科目号。 
 * </pre>
 *
 * Protobuf enum {@code AccountTitle}
 */
public enum AccountTitle
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_ACCOUNTTITLE = 0;</code>
   */
  UNKNOWN_ACCOUNTTITLE(0),
  /**
   * <pre>
   *个人存款或钱包
   * </pre>
   *
   * <code>PERSONAL_DEPOSIT = 2203001;</code>
   */
  PERSONAL_DEPOSIT(2203001),
  /**
   * <pre>
   *对公存款账户
   * </pre>
   *
   * <code>BUSINESS_DEPOSIT = 2203002;</code>
   */
  BUSINESS_DEPOSIT(2203002),
  /**
   * <pre>
   * 银行卡对私账户
   * </pre>
   *
   * <code>PERSONAL_BANK_CARD = 3001001;</code>
   */
  PERSONAL_BANK_CARD(3001001),
  /**
   * <pre>
   *银行卡对公账户
   * </pre>
   *
   * <code>BUSINESS_BANK_CARD = 3001002;</code>
   */
  BUSINESS_BANK_CARD(3001002),
  /**
   * <pre>
   *虚币账户
   * </pre>
   *
   * <code>VIRTUAL_CURRENCY = 3001003;</code>
   */
  VIRTUAL_CURRENCY(3001003),
  /**
   * <pre>
   *第三方平台账户
   * </pre>
   *
   * <code>PLATFORM_ACCOUNT = 3001004;</code>
   */
  PLATFORM_ACCOUNT(3001004),
  ;

  /**
   * <code>UNKNOWN_ACCOUNTTITLE = 0;</code>
   */
  public static final int UNKNOWN_ACCOUNTTITLE_VALUE = 0;
  /**
   * <pre>
   *个人存款或钱包
   * </pre>
   *
   * <code>PERSONAL_DEPOSIT = 2203001;</code>
   */
  public static final int PERSONAL_DEPOSIT_VALUE = 2203001;
  /**
   * <pre>
   *对公存款账户
   * </pre>
   *
   * <code>BUSINESS_DEPOSIT = 2203002;</code>
   */
  public static final int BUSINESS_DEPOSIT_VALUE = 2203002;
  /**
   * <pre>
   * 银行卡对私账户
   * </pre>
   *
   * <code>PERSONAL_BANK_CARD = 3001001;</code>
   */
  public static final int PERSONAL_BANK_CARD_VALUE = 3001001;
  /**
   * <pre>
   *银行卡对公账户
   * </pre>
   *
   * <code>BUSINESS_BANK_CARD = 3001002;</code>
   */
  public static final int BUSINESS_BANK_CARD_VALUE = 3001002;
  /**
   * <pre>
   *虚币账户
   * </pre>
   *
   * <code>VIRTUAL_CURRENCY = 3001003;</code>
   */
  public static final int VIRTUAL_CURRENCY_VALUE = 3001003;
  /**
   * <pre>
   *第三方平台账户
   * </pre>
   *
   * <code>PLATFORM_ACCOUNT = 3001004;</code>
   */
  public static final int PLATFORM_ACCOUNT_VALUE = 3001004;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AccountTitle valueOf(int value) {
    return forNumber(value);
  }

  public static AccountTitle forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_ACCOUNTTITLE;
      case 2203001: return PERSONAL_DEPOSIT;
      case 2203002: return BUSINESS_DEPOSIT;
      case 3001001: return PERSONAL_BANK_CARD;
      case 3001002: return BUSINESS_BANK_CARD;
      case 3001003: return VIRTUAL_CURRENCY;
      case 3001004: return PLATFORM_ACCOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AccountTitle>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AccountTitle> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AccountTitle>() {
          public AccountTitle findValueByNumber(int number) {
            return AccountTitle.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.jigsaw.payment.model.Enums.getDescriptor().getEnumTypes().get(1);
  }

  private static final AccountTitle[] VALUES = values();

  public static AccountTitle valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AccountTitle(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:AccountTitle)
}

