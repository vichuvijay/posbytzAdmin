Feature: New account Setup and normal flow test
Setup location details and create category, item, variation, inventory, tax, price category, charges


@happyflow
Scenario: Normal flow
Given User entered signup page
Then selected the Business type
Then Entered valid Emailid
Then Entered valid mobilenumber
Then user clicked register button
Then Redirect to home page and check signed in successfully
Then selecting the update address
Then selecting the edit location address
Then entering the location name
Then entering the addressline1
Then entering the addressline2
Then selecting the country
Then entering the region
Then entering the city
Then entering the postalcode
#Then entering the TRN
#Then entering the Company Registration Number
#Then entering the FSSAI License Number
#Then entering the Order Sequence No Prefix
#Then entering the Maximum Delivery Distance
#Then entering the Latitude
#Then entering the Longitude
#Then checking the Pickup Available checkbox
#Then checking the Delivery Available checkbox
Then saving location details
Then clicking the item menu
Then clicking the categories
Then clicking the create category
Then entering the category name
Then clicking the save button
Then check category is created
Then clicking the brands
Then clicking the create brand
Then entering the brand name
Then clicking the save button
Then check brand is created
Then clicking the discounts
Then clicking the create discount
Then entering the discount name
Then clicking the discount location
Then choosing the discount location
Then clicking the is apply automatically
Then choosing buy criteria as order
Then choosing type as subtotal
Then entering the prerequisite value
Then choosing get criteria as subtotal
Then choosing type as fixed
Then entering the discount value
Then clicking the discount save button
Then clicking the taxes
Then clicking the create taxes
Then entering the tax name
Then entering the tax percentage
Then selecting the tax_type
Then clicking the save button
Then check tax is created
Then clicking the charges
Then clicking the create charges
Then entering the charge name
Then selecting the charge category
Then entering the charge value
Then clicking the is online
Then clicking the is apply automatically
Then entering the base distance
Then entering the additional cost
Then clicking the add button
Then clicking the save button
Then check deliverycharge created
Then clicking the pcategories
Then clicking the create pcategory
Then entering the pCategory name
Then selecting the pcategorytype
Then selecting the pCategory value type
Then entering the pCategory value
Then clicking the save button
Then check price category is created
Then clicking the Attributes btn
Then clicking the Create attribute btn
Then clicking the Select attribute btn
Then entering the attribute name
Then entering the attribute value
Then clicking the save button
Then check attribute is created
Then clicking the item library
Then clicking the Create item
Then entering the Item_name
Then selecting the category
Then selecting the brand
Then clicks the item save button
Then check item is created
Then clicking On Add Variation
Then entering Variation Name
Then selecting VariationType
Then selecting UomType
Then entering sale Sku
Then selecting FoodType
Then clicking On Submit
Then check variation is created
Then clicking On AddInventory
Then selecting pricingtype
Then entering BuyingPrice
Then entering Mrp
Then entering SellingPrice
Then selecting SellingTax
Then selecting BuyingTax
Then selecting price category
Then adding the price category
Then entering StockValue
Then entering LowStockValue
Then clicking OnlineInventory
Then clicking the variation save button
Then clicking yes
Then check inventory is created
Then click on attribute
Then click on create attribute
Then click on select attribute
Then choose attribute
Then choose attribute value
Then save attribute value


#Editing item
Then clicking item edit
Then changing item name
Then clicking the item save button
Then refreshing the page
Then clicking the categories
Then clicking the category edit button
Then changing the category name
Then clicking the save button
Then refreshing the page
Then clicking the brands
Then clicking the brand edit button
Then changing the brand name
Then clicking the save button
Then refreshing the page
Then clicking the taxes
Then clicking the taxes edit button
Then changing the tax detail
Then selecting the save2 button
Then refreshing the page
Then clicking the pcategories
Then clicking the pcategory edit button
Then changing the pcategory detail
Then clicking the pcategory save button
Then refreshing the page
Then clicking the Attributes btn
Then clicking the Attributes edit button
Then changing the Attributes detail
Then selecting the save2 button
Then refreshing the page

# Check edited details are reflected
Then clicking the item library
Then clicking the item view
Then check item name changed
Then check category name changed
Then check brand name changed
Then check tax details are changed
Then check pricecategory details are changed
Then check attribute details are changed
# creating modifier
Then clicking On Add Variation
Then entering modifier Variation Name
Then selecting modifier VariationType
Then selecting UomType
Then entering modifier Sku
Then selecting modifier FoodType
Then clicking On modifier Submit
Then click on modifier link
Then clicking On AddInventory
Then selecting pricingtype
Then entering BuyingPrice
Then entering Mrp
Then entering SellingPrice
Then entering StockValue
Then entering LowStockValue
Then clicking OnlineInventory
Then clicking the variation save button
Then clicking yes
Then check inventory is created

# creating ingredient
Then clicking On Add Variation
Then entering ingredient Variation Name
Then selecting ingredient VariationType
Then selecting UomType
Then entering ingredient Sku
Then selecting ingredient FoodType
Then clicking On ingredient Submit
Then click on ingredient link
Then clicking On AddInventory
Then selecting pricingtype
Then entering BuyingPrice
Then entering Mrp
Then entering SellingPrice
Then entering StockValue
Then entering LowStockValue
Then clicking OnlineInventory
Then clicking the variation save button
Then clicking yes
Then check inventory is created

# creating recipe
Then clicking On Add Variation
Then entering recipe Variation Name
Then selecting recipe VariationType
Then selecting recipe UomType
Then entering recipe Sku
Then selecting recipe FoodType
Then clicking On recipe Submit
Then click on recipe link
Then clicking On AddInventory
Then selecting pricingtype
Then entering BuyingPrice
Then entering Mrp
Then entering SellingPrice
Then entering StockValue
Then entering LowStockValue
Then clicking OnlineInventory
Then clicking the variation save button
Then clicking yes
Then check inventory is created

#mapping ingredient and recipe
Then click on main item
Then click on add ingredientrecipe link
Then click on add ingredient recipe button
Then selecting ingredient mapping type
Then selecting ingredient
Then entering value
Then choosing uom of ingredient
Then clicking the save button
Then click on add ingredient recipe button2
Then selecting recipe mapping type
Then selecting recipe
Then entering value
Then choosing uom of recipe
Then clicking the save button


#employee roles

Then Clicking the Employee Menu
Then Clicking the Roles tab
Then Clicking the create role button
Then Entering the Name of the role
Then Clicking the full access in the role.
Then Clicking the save button in the role.
Then Check the role is Created.
#employee create

Then Clicking the Employee create button
Then Entering the Employee Name
Then Clicking The Employee Type
Then Selecting the Employee Type
Then Set the Employee password
Then Set the Employee six digit password
Then Set the Employee Four digit password
Then Enter the Employee Email
Then Enter the Employee Phone Number
Then Clicking the Employee Role
Then Select the Employee Role
Then Click the Save button in the Employee
Then Check Employee is not created and through subscription validation
Then Close the Employee subscription page.
Then Close the Employee Create Popup

#customers

Then Clicking the customer menu
Then Clicking the customer group tab
Then Clicking the create group button
Then Entering the group name
Then Clicking the save button in the customer group
Then Check the customer group is created
Then Clicking the customer tab 
Then Clicking the customer create button
Then Entering the customer first name
Then Entering the customer last name
Then Entering the customer email
Then Entering the customer phone number
Then Clicking the customer group
Then Select the customer group
Then Entering the customer code

#Then Entering the customer DOB

Then Click the customer gender
Then Entering the customer address line
Then Entering the customer landmark
Then Entering the customer area
Then Selecting the customer country
Then Selecting the customer state
Then Selecting the customer city
Then Entering the customer zipcode
Then Selecting the customer address type
Then Entering the customer latitude
Then Entering the customer longitude
Then Entering the customer TRN and GSTIN andVAT number
Then Entering the customer CR number
Then Entering the customer company number
Then Entering the customers notes
Then Clicking the customer save button
Then Check the customer is created

#customer edit

Then Click the edit button in the customer
Then Editing the customer first name
Then Editing the customer second name
Then Editing the customer email
Then Editing the customer phone number
Then Clicking the customer save button
Then Check the edit customer is created

#loyalty management

Then Clicking the loyalty management menu
Then Clicking the create loyalty button
Then Entering the loyalty name
Then Clicking the loyalty location
Then selecting the loyalty location
Then Entering the loyalty description
Then Entering the customer signup points
Then Entering the Specify the amount required to earn one loyalty point 
Then Entering the Discount Type (Applicable on order)
Then Entering the Discount Value (Applicable on order)
Then Entering the Minimum Reward Points Needed (For Earning Reward)
Then Entering the Discount Amount for each point
Then Clicking the save button in the loyalty
Then Check the loyalty is created

#edit the loyalty

Then Clicking the edit button
Then Editing the loyalty name
Then Editing the customer signup points
Then Editing the Specify the amount required to earn one loyalty point
Then Editing the discount Type
Then Editing the discount value
Then Editing the Minimum Reward Points Needed
Then Editing the Discount Amount for each point
Then Clicking the save button in the loyalty edit
Then Check the edit changes in the loyalty
Then Close the loyalty

# restaurant Management------------------------------------------------

Then Clicking the restaurant management menu
Then Clicking the create floor button
Then Entering the floor name
Then Selecting the floor location name
Then Clicking the save button in the floor
Then Check the floor is created
Then Clicking the tables button in the created floor
Then Clicking the create table button
Then Entering the Table name
Then Entering the Table seating capacity
Then Selecting the price category
Then Clicking the save button in the table
Then Check the table is created
Then Clicking the floor plan button
Then Clicking the set option in the edit floor plan
Then Check the floor layout is created
Then Close the floor layout

#edit
Then Clicking the edit button in the table
Then Editing the Table name
Then Editing the Table seating capacity
Then Editing the price category
Then Clicking the save button in the edit table
Then Check the edit changes in the tables

#----------------------------
Then Clicking the inventory management menu
Then Clicking the inventory management more actions button
Then Clicking the vendor in more actions
Then Clicking the vendor create button
Then Entering the vendor name
Then Entering the vendor email
Then Entering the vendor phone number
Then Entering the vendor code
Then Entering the vendor address line one
Then Entering the vendor address line two
Then Entering the vendor city
Then Entering the vendor region
Then Entering the vendor country
Then Entering the vendor postal code
Then Entering the vendor TRN
Then Entering the vendor CRN
Then Clicking the vendor save button
Then Check the vendor is created

Then Clicking the purchase order tab
Then Clicking the purchase order create button
Then Selecting the vendor in the purchase order
Then Selecting the ship to location in purchase order
Then Selecting the expected delivery date in purchase order
Then Entering the PO invoice number
Then Selecting the billing date in purchase order
Then Entering the purchase order notes
Then Clicking the add items in the purchase order
Then Clicking the select item
Then Entering the variation in purchase order
Then Entering the Quantity in purchase order
Then Selecting the discount Type in purchase order
Then Entering the discount value in the purchase order 
Then Clicking the save button in add single item in purchase
Then Clicking the save button in purchase order
Then Clicking the Approve button in purchase order
Then Clicking the OK button in approve popup in purchase order
Then Clicking the Recieve order in the purchase order
Then Clicking the check button in receive prefill quantity in the purchase order
Then Clicking the save button in the receive purchase order
Then Clicking the GRN details in the purchase order
Then Clicking the more options in the Grn details in purchase order
Then Clicking the add payment in the Grn details in purchase order
Then Clicking the Cash payment in the puchase order
Then Entering the payment date in the puchase order
Then Clicking the save button in payment details of the puchase order
Then Clicking the inventory management menu
Then Clicking the history in the inventory management
#Then Check the stock received in the purchase order

#GRN

Then Clicking the Grn tab
Then Clicking the create GRN button
Then Selecting the vendor in the purchase order
Then Selecting the ship to location in purchase order
Then Selecting the expected delivery date in purchase order
Then Entering the PO invoice number
Then Selecting the billing date in purchase order
Then Entering the purchase order notes
Then Clicking the add items in the purchase order
Then Clicking the select item
Then Entering the variation in purchase order
Then Entering the Quantity in purchase order
Then Selecting the discount Type in purchase order
Then Entering the discount value in the purchase order 
Then Clicking the save button in add single item in purchase
Then Clicking the save button in purchase order

Then Clicking the GRN details in the purchase order
Then Clicking the more options in the Grn details in purchase order
Then Clicking the add payment in the Grn details in purchase order
Then Clicking the Cash payment in the puchase order
Then Entering the payment date in the puchase order
Then Clicking the save button in payment details of the puchase order
Then Clicking the history in the inventory management

#Waste Management

Then Clicking the Waste Management tab
Then Clicking the create waste management button
Then Clicking the Wastage location
Then Selecting the approver in waste management
Then Clicking the select variation in the waste management
Then Selecting the variation in the waste management
Then Entering the stock adjustment in the waste management
Then Selecting the stock adjustment reason in the waste management
Then Clicking the add button in the waste management
Then Clicking the save button in the waste management
Then Clicking the Approve button in purchase order
Then Clicking the OK button in approve popup in purchase order
Then Clicking the Complete button in the waste Management
Then Clicking the OK button in approve popup in purchase order

#Preparation Order

Then Clicking the inventory management more actions button
Then Clicking the preparation order in the more actions
Then Clicking the create preparation order button
Then Selecting the ship to location in purchase order
Then Selecting the approver in waste management
Then Clicking the select variation in the waste management
Then Selecting the variation in the preparation order
Then Entering the quantity in the preparation order
Then Clicking the add button in the waste management
Then Clicking the save button in the waste management

Then Clicking the Approve button in purchase order
Then Clicking the OK button in approve popup in purchase order
Then Clicking the Complete button in the waste Management
Then Clicking the OK button in approve popup in purchase order
Then Clicking the history in the inventory management


#Inventory Audit

Then Clicking the inventory management more actions button
Then Clicking the Inventory Audit in the inventory management
Then Clicking the create inventory audit button
Then Selecting the ship to location in purchase order
Then Selecting the Auditor in inventory audit
Then Selecting the approver in the inventory audit
Then Clicking the add item in the inventory audit
Then Entering the variation in the search field in the inventory audit
Then Clicking the variation checkbox in the inventory audit
Then Clicking the selected add item button in inventory audit
Then Clicking the save button in the waste management
Then Clicking the count stock button in inventory audit
Then Entering the Total physical stock in inventory audit
Then Entering the expired stock in inventory audit
Then Entering the damage stock in inventory audit
Then Clicking the save button in count stock inventory audit
Then Clicking the send to approve count button in inventory audit
Then Clicking the OK button in approve popup in purchase order
Then Clicking the approve count stock in inventory
Then Clicking the OK button in approve popup in purchase order
Then Clicking the OK button in approve popup in purchase order
Then Clicking the count stock button in inventory audit
Then Tally the count stock in the inventory audit
Then Clicking the save button in count stock inventory audit
Then Clicking the approve count stock in inventory
Then Clicking the OK button in approve popup in purchase order
Then Clicking the complete count stock button in inventory
Then Clicking the OK button in approve popup in purchase order


#Account and settings

Then Clicking the account and settings menu
Then Clicking the business profile tab
Then Entering the business location address one
Then Entering the business location address two
Then Selecting the customer country
Then Selecting the customer state
Then Selecting the customer city
Then entering the business location postal code
Then entering the business location whatsapp number
Then entering the opening time in business profile
Then entering the closing time in business profile
Then Entering the currency symbol in the business profile
Then Entering the bank name in business profile
Then Entering the account number in business profile
Then Entering the bank code label in the business profile
Then Entering the bank code in the business profile
Then Entering the customer TRN and GSTIN andVAT number
Then Entering the company registration number in the business profile
Then clicking the save button in the business profile


#Payment methods Reports
Then Clicking the account and settings menu
Then Clicking the payments methods Tab
Then Click the Add payment method button in payment methods
Then Entering the payment label Name
Then Clicking the payment methods
Then Selecting the payment methods
Then Entering the positon of payment methods
Then Selcting the Pos platforms in payment methods
Then enable the checkbox in the default payment methods reports
Then Clicking the save button in the payment methods
Then Check the success message is created.

#Unit of measurements
Then Clicking the UOM tab
Then Clicking the create UOM button
Then Entering the UOM name
Then selecting the UOM type
Then clicking the checkbox in the Is UOM attribute
Then Entering the integer place unit
Then Entering the decimal place unit
Then Clicking the save button in the payment methods
Then Check the success message is created.

#item tag
Then Clicking the item tag menu
Then Clicking the item tag create button
Then Entering the name for item tag
Then Selecting the category for item tag
Then Clicking the save button in the payment methods
Then Check the success message is created.

#--------------------------------------------------------------------------------------------------------------------------------------------
#--------------------------------------------------------------------------------------------------------------------------------------------
@loginAccount
Scenario: Normal flow
Given User entered signup page
Then selected the Business type
Then Entered valid Emailid
Then Entered valid mobilenumber
Then user clicked register button
Then Redirect to home page and check signed in successfully
Then selecting the update address
Then selecting the edit location address
Then entering the location name
Then entering the addressline1
Then entering the addressline2
Then selecting the country
Then entering the region
Then entering the city
Then entering the postalcode
#Then entering the TRN
#Then entering the Company Registration Number
#Then entering the FSSAI License Number
#Then entering the Order Sequence No Prefix
#Then entering the Maximum Delivery Distance
#Then entering the Latitude
#Then entering the Longitude
#Then checking the Pickup Available checkbox
#Then checking the Delivery Available checkbox
Then saving location details
#----------------------------------------
#employee roles

Then Clicking the Employee Menu
Then Clicking the Roles tab
Then Clicking the create role button
Then Entering the Name of the role
Then Clicking the full access in the role.
Then Clicking the save button in the role.
Then Check the role is Created.
#employee create

Then Clicking the Employee create button
Then Entering the Employee Name
Then Clicking The Employee Type
Then Selecting the Employee Type
Then Set the Employee password
Then Set the Employee six digit password
Then Set the Employee Four digit password
Then Enter the Employee Email
Then Enter the Employee Phone Number
Then Clicking the Employee Role
Then Select the Employee Role
Then Click the Save button in the Employee
Then Check Employee is not created and through subscription validation
Then Close the Employee subscription page.
Then Close the Employee Create Popup

#customers

Then Clicking the customer menu
Then Clicking the customer group tab
Then Clicking the create group button
Then Entering the group name
Then Clicking the save button in the customer group
Then Check the customer group is created
Then Clicking the customer tab 
Then Clicking the customer create button
Then Entering the customer first name
Then Entering the customer last name
Then Entering the customer email
Then Entering the customer phone number
Then Clicking the customer group
Then Select the customer group
Then Entering the customer code

#Then Entering the customer DOB

Then Click the customer gender
Then Entering the customer address line
Then Entering the customer landmark
Then Entering the customer area
Then Selecting the customer country
Then Selecting the customer state
Then Selecting the customer city
Then Entering the customer zipcode
Then Selecting the customer address type
Then Entering the customer latitude
Then Entering the customer longitude
Then Entering the customer TRN and GSTIN andVAT number
Then Entering the customer CR number
Then Entering the customer company number
Then Entering the customers notes
Then Clicking the customer save button
Then Check the customer is created

#customer edit

Then Click the edit button in the customer
Then Editing the customer first name
Then Editing the customer second name
Then Editing the customer email
Then Editing the customer phone number
Then Clicking the customer save button
Then Check the edit customer is created

#loyalty management

Then Clicking the loyalty management menu
Then Clicking the create loyalty button
Then Entering the loyalty name
Then Clicking the loyalty location
Then selecting the loyalty location
Then Entering the loyalty description
Then Entering the customer signup points
Then Entering the Specify the amount required to earn one loyalty point 
Then Entering the Discount Type (Applicable on order)
Then Entering the Discount Value (Applicable on order)
Then Entering the Minimum Reward Points Needed (For Earning Reward)
Then Entering the Discount Amount for each point
Then Clicking the save button in the loyalty
Then Check the loyalty is created

#edit the loyalty

Then Clicking the edit button
Then Editing the loyalty name
Then Editing the customer signup points
Then Editing the Specify the amount required to earn one loyalty point
Then Editing the discount Type
Then Editing the discount value
Then Editing the Minimum Reward Points Needed
Then Editing the Discount Amount for each point
Then Clicking the save button in the loyalty edit
Then Check the edit changes in the loyalty
Then Close the loyalty

# restaurant Management------------------------------------------------

Then Clicking the restaurant management menu
Then Clicking the create floor button
Then Entering the floor name
Then Selecting the floor location name
Then Clicking the save button in the floor
Then Check the floor is created
Then Clicking the tables button in the created floor
Then Clicking the create table button
Then Entering the Table name
Then Entering the Table seating capacity
Then Selecting the price category
Then Clicking the save button in the table
Then Check the table is created
Then Clicking the floor plan button
Then Clicking the set option in the edit floor plan
Then Check the floor layout is created
Then Close the floor layout

#edit
Then Clicking the edit button in the table
Then Editing the Table name
Then Editing the Table seating capacity
Then Editing the price category
Then Clicking the save button in the edit table
Then Check the edit changes in the tables

#----------------------------
Then Clicking the inventory management menu
#Then Clicking the inventory management more actions button
Then Clicking the vendor in more actions
Then Clicking the vendor create button
Then Entering the vendor name
Then Entering the vendor email
Then Entering the vendor phone number
Then Entering the vendor code
Then Entering the vendor address line one
Then Entering the vendor address line two
Then Entering the vendor city
Then Entering the vendor region
Then Entering the vendor country
Then Entering the vendor postal code
Then Entering the vendor TRN
Then Entering the vendor CRN
Then Clicking the vendor save button
Then Check the vendor is created






#--------------------------------------
#Quotation

Then Clicking the Sales menu
Then Clicking the Quotation tab
Then clicking the new quotation button
#Then Selecting the customer in the quotation
Then Clicking the customer create button
Then Entering the customer first name
Then Entering the customer last name
Then Entering the customer email
Then Entering the customer phone number
#Then Clicking the customer group
#Then Select the customer group
Then Entering the customer code

Then Click the customer gender
Then Entering the customer address line
Then Entering the customer landmark
Then Entering the customer area
Then Selecting the customer country
Then Selecting the customer state
Then Selecting the customer city
Then Entering the customer zipcode
Then Clicking the customer save button

Then Selecting the ship to location in purchase order
Then Clicking the due date in quotation
Then Entering the description in quotation
Then Entering the billing address in quotation
Then Entering the customer address line
Then Entering the customer landmark
Then Entering the customer area
Then Selecting the customer country
Then Selecting the customer state
Then Selecting the customer city
Then Clicking the customer save button

Then Entering the Shipping address in quotation
Then Entering the customer address line
Then Entering the customer landmark
Then Entering the customer area
Then Selecting the customer country
Then Selecting the customer state
Then Selecting the customer city
Then Clicking the customer save button


Then Clicking the select item
Then Entering the variation in purchase order
Then Entering the delivery date in quotation
Then Entering the reference numbe in the quotation
Then Clicking the save button in the waste management
Then Clicking the convert to invoice button
Then Clicking the Cash payment in the puchase order
Then Clicking the create invoice button
Then Get the order number of quotation created
#Then Clicking the transaction Tab
#Then Check the order number through quotation in the transaction


#----------------------------------




