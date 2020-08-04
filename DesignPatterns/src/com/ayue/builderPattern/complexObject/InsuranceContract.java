/**
 * 
 */
package com.ayue.builderPattern.complexObject;

/**
 * 2019年2月22日
 *
 * @author ayue
 */
public class InsuranceContract {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public InsuranceContract(ConcreteBuilder concreteBuilder) {
                this.contractId = concreteBuilder.contractId;
                this.personName = concreteBuilder.personName;
                this.companyName = concreteBuilder.companyName;
                this.beginDate = concreteBuilder.beginDate;
                this.endDate = concreteBuilder.endDate;
                this.otherData = concreteBuilder.otherData;
        }

        public void someOperation() {
                System.out.println("编号：" + this.contractId);
                System.out.println("父亲名：" + this.personName);
                System.out.println("公司名：" + this.companyName);
                System.out.println("开始时间：" + this.beginDate);
                System.out.println("结束时间：" + this.endDate);
                System.out.println("其他：" + this.otherData);
        }

        // 将具体建造者合并到了产品对象中，并将产品对象的构造函数私有化，防止客户端不使用构建器来构建产品对象，而是直接去使用new来构建产品对象所导致的问题。
        public static class ConcreteBuilder {
                private String contractId;
                private String personName;
                private String companyName;
                private long beginDate;
                private long endDate;
                private String otherData;

                public ConcreteBuilder(String contractId, long beginDate, long endDate) {
                        this.contractId = contractId;
                        this.beginDate = beginDate;
                        this.endDate = endDate;
                }

                public ConcreteBuilder setPersonName(String personName) {
                        this.personName = personName;
                        return this;
                }

                public ConcreteBuilder setComoanyName(String comoanyName) {
                        this.companyName = comoanyName;
                        return this;
                }

                public ConcreteBuilder setOtherData(String otherData) {
                        this.otherData = otherData;
                        return this;
                }

                // 构建真正的对象并返回
                public InsuranceContract build() {
                        return new InsuranceContract(this);
                }
        }
}
