import React from 'react';
import '../css/PaymentDetails.css';
import ReactDOM from 'react-dom';

function PaymentDetails() {
    return (
        <div className ="emp-card-container">
        <form className="searchbar-admin" method="POST">
        <input type="text" class="searchbar-admin_search" placeholder="Search user by name or id"></input>
        <div className="search-icon"><i class="fas fa-search"></i></div>
        </form>
        
        <div className ="fullCard">
             <p>Hasani Nimeshika</p> 
        </div>
        <div className ="fullCard">
             <p>Hasani Nimeshika</p> 
        </div>
        <div className ="fullCard">
             <p>Hasani Nimeshika</p> 
        </div>
        <div className ="fullCard">
             <p>Hasani Nimeshika</p> 
        </div>
        </div>
       
    )
}

export default PaymentDetails;
