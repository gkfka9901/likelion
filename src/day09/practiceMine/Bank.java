package day09.practiceMine;

public class Bank {
    // 고객을 배열로 관리
    Customer[] customers = new Customer[10];

    int customerCount=0;


    // 고객 추가
    public void register(String name, String id) throws BankOperationException{
        if (findCustomerById(id) != null) { // && 같은지
            throw new BankOperationException("중복된 ID가 존재합니다.");
        }
        customers[customerCount++] = new Customer(name, id);

        System.out.println("등록이 완료되었습니다.");
    }

    // 고객 검색(리턴 타입: Customer)
    public Customer findCustomerById(String id) {
        for (Customer customer : customers) {
            if (customer.id.equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
