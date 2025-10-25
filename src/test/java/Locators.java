public class Locators {

        //Login page
        public static String headerLogin = "//h1[normalize-space()='Login']";
        public static String inputEmail = "//input[@id='email']";
        public static String inputPassword = "//input[@id='password']";
        public static String buttonLogin = "//button[normalize-space()='Login']";
        public static String checkboxRememberMe = "//input[@id='remember']";
        public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
        public static String alertErrorMessage = "//div[@id='alerts']/div";

        //New Customer
        //kh nên chọn thẻ select vì đó là thẻ trung gian ngầm lưu giữ value => chọn button or div
        public static String tabCustomerDetails = "//a[normalize-space()='Customer Details']/preceding::hi4";
        public static String inputCompany = "//input[@id='company']";
        public static String inputVAT = "//input[@id='vat']";
        public static String inputPhoneNumber = "//input[@id='phonenumber']";
        public static String inputWebsite = "//input[@id='website']";
        public static String dropdownGroup = "//button[@data-id='groups_in[]']";
        public static String addGroup = "//div[@class='input-group-btn']";
        public static String inputSearchGroup = "//button[@data-id='groups_in[]']/following-sibling::div//input";

        public static String selectCurrency = "//select[@id='default_currency']";
        public static String selectDefaultLanguage = "//select[@id='default_language']";
        public static String inputAddress = "//textarea[@id='address']";
        public static String inputCity = "//input[@id='city']";
        public static String inputState = "//input[@id='state']";
        public static String inputZip = "//input[@id='zip']";
        public static String selectCountry = "//select[@id='country']";
        public static String buttonSaveAndCreate = "//button[normalize-space()='Save and create contact']";
        //=> có khả năng button bị trùng nên dùng thẻ div trên nó có id//button sẽ chuẩn hơn
        public static String buttonSave = "//div[@id='profile-save-section']//button[normalize-space()='Save']";
        public static String errorCompany = "//p[@id='company-error']";

        //Project
        public static String menuProject = "//span[normalize-space()='Projects']";
        public static String titleAddNewProject = "//a[normalize-space()='Project']/preceding::h4";
        public static String inputProjectName = "//input[@id='name']";
        public static String inputCustomer = "//select[@id='clientid']";
        public static String checkboxCalculateProgress = "//input[@id='progress_from_tasks']";
        public static String scrollProgress = "//input[@name='progress']/following-sibling::div/span";
        public static String selectBillingType = "//select[@id='billing_type']";
        public static String selectStatus = "//select[@id='status']";
        public static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
        public static String inputEstimatedHours = "//input[@id='estimated_hours']";
        public static String seclectMember = "//select[contains(@id,'project_members')]";
        public static String inputStartDate = "//input[@id='start_date']";
        public static String inputDealine = "//input[@id='deadline']";
        public static String inputTag = "//input[@placeholder='Tag']";
        public static String inputDescription = "//textarea[@id='description']/parent::div";
        public static String checkboxSendProjectCreateEmail = "//input[@id='send_created_email']";
        public static String buttonSaveProject = "//button[normalize-space()='Save']";

    }


