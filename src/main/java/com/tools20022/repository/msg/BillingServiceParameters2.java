/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.ProductQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import com.tools20022.repository.msg.BillingServiceIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the detailed parameters a service to be billed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmBankService
 * BillingServiceParameters2.mmBankService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmVolume
 * BillingServiceParameters2.mmVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmUnitPrice
 * BillingServiceParameters2.mmUnitPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmServiceChargeAmount
 * BillingServiceParameters2.mmServiceChargeAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingServiceParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the detailed parameters a service to be billed."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingServiceParameters2", propOrder = {"bankService", "volume", "unitPrice", "serviceChargeAmount"})
public class BillingServiceParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BkSvc", required = true)
	protected BillingServiceIdentification2 bankService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification2
	 * BillingServiceIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2
	 * BillingServiceParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the details to fully identify the bank service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceParameters2, BillingServiceIdentification2> mmBankService = new MMMessageAttribute<BillingServiceParameters2, BillingServiceIdentification2>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceParameters2.mmObject();
			isDerived = false;
			xmlTag = "BkSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankService";
			definition = "Specifies the details to fully identify the bank service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BillingServiceIdentification2.mmObject();
		}

		@Override
		public BillingServiceIdentification2 getValue(BillingServiceParameters2 obj) {
			return obj.getBankService();
		}

		@Override
		public void setValue(BillingServiceParameters2 obj, BillingServiceIdentification2 value) {
			obj.setBankService(value);
		}
	};
	@XmlElement(name = "Vol")
	protected DecimalNumber volume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2
	 * BillingServiceParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Volume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count or number of items (volume) involved in the charge."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceParameters2, Optional<DecimalNumber>> mmVolume = new MMMessageAttribute<BillingServiceParameters2, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceParameters2.mmObject();
			isDerived = false;
			xmlTag = "Vol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Volume";
			definition = "Count or number of items (volume) involved in the charge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(BillingServiceParameters2 obj) {
			return obj.getVolume();
		}

		@Override
		public void setValue(BillingServiceParameters2 obj, Optional<DecimalNumber> value) {
			obj.setVolume(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitPric")
	protected AmountAndDirection34 unitPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2
	 * BillingServiceParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price per item or unit used to calculate the charge expressed in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingServiceParameters2, Optional<AmountAndDirection34>> mmUnitPrice = new MMMessageAssociationEnd<BillingServiceParameters2, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceParameters2.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Price per item or unit used to calculate the charge expressed in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceParameters2 obj) {
			return obj.getUnitPrice();
		}

		@Override
		public void setValue(BillingServiceParameters2 obj, Optional<AmountAndDirection34> value) {
			obj.setUnitPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "SvcChrgAmt", required = true)
	protected AmountAndDirection34 serviceChargeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountAdministrationCharge
	 * AccountService.mmAccountAdministrationCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2
	 * BillingServiceParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcChrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge expressed in the pricing currency, exclusive of any tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingServiceParameters2, AmountAndDirection34> mmServiceChargeAmount = new MMMessageAssociationEnd<BillingServiceParameters2, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> AccountService.mmAccountAdministrationCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceParameters2.mmObject();
			isDerived = false;
			xmlTag = "SvcChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceChargeAmount";
			definition = "Amount of the calculated charge expressed in the pricing currency, exclusive of any tax.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BillingServiceParameters2 obj) {
			return obj.getServiceChargeAmount();
		}

		@Override
		public void setValue(BillingServiceParameters2 obj, AmountAndDirection34 value) {
			obj.setServiceChargeAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServiceParameters2.mmBankService, com.tools20022.repository.msg.BillingServiceParameters2.mmVolume,
						com.tools20022.repository.msg.BillingServiceParameters2.mmUnitPrice, com.tools20022.repository.msg.BillingServiceParameters2.mmServiceChargeAmount);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingServiceParameters2";
				definition = "Specifies the detailed parameters a service to be billed.";
			}
		});
		return mmObject_lazy.get();
	}

	public BillingServiceIdentification2 getBankService() {
		return bankService;
	}

	public BillingServiceParameters2 setBankService(BillingServiceIdentification2 bankService) {
		this.bankService = Objects.requireNonNull(bankService);
		return this;
	}

	public Optional<DecimalNumber> getVolume() {
		return volume == null ? Optional.empty() : Optional.of(volume);
	}

	public BillingServiceParameters2 setVolume(DecimalNumber volume) {
		this.volume = volume;
		return this;
	}

	public Optional<AmountAndDirection34> getUnitPrice() {
		return unitPrice == null ? Optional.empty() : Optional.of(unitPrice);
	}

	public BillingServiceParameters2 setUnitPrice(AmountAndDirection34 unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	public AmountAndDirection34 getServiceChargeAmount() {
		return serviceChargeAmount;
	}

	public BillingServiceParameters2 setServiceChargeAmount(AmountAndDirection34 serviceChargeAmount) {
		this.serviceChargeAmount = Objects.requireNonNull(serviceChargeAmount);
		return this;
	}
}