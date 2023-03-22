package mvc.Controler;

import lombok.Getter;
import mvc.Model.VM.VendingMachine;
import mvc.Servise.VMService.VmServisesImpl;
import mvc.View.ConsoleViewer;
import mvc.View.MenuSelector;

@Getter
public class ConsoleConrtolerImpl implements ConsoleControler {

    private final VendingMachine vm;
    private final VmServisesImpl vmServises;
    private final ConsoleViewer consoleViewer;

    public ConsoleConrtolerImpl(VendingMachine vm, VmServisesImpl vmServises, ConsoleViewer consoleViewer) {
        this.vm = vm;
        this.vmServises = vmServises;
        this.consoleViewer = consoleViewer;
    }

    @Override
    public void makeSale() {

    }

    public void showStorage() {
        consoleViewer.showStorage(vm.getStorage());

    }

    @Override
    public void showSalesInfo() {
        consoleViewer.showSaleInfo(vm.getSaleInfo());

    }

    @Override
    public void luncher() {

        boolean isWorking = true;

        MenuSelector selector;

        while (isWorking) {

            selector = consoleViewer.askFromMenu();

            switch (selector) {
                case EXIT:
                    isWorking = false;
                    break;
                case SALE:
                    System.out.println("Продажа");

                    break;
                case INFO_SALE:
                    showSalesInfo();
                    break;
                case INFO_STORAGE:
                    showStorage();
                    break;
            }
        }

    }
}
