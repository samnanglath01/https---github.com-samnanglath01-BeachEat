document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('submitButton').addEventListener('click', submitForm);
    document.getElementById('loadButton').addEventListener('click', loadUserData);
});

function submitForm() {
    const formData = {
        username: document.getElementById('username').value,
        lastName: document.getElementById('lastname').value,
        firstName: document.getElementById('firstname').value,
        dob: parseInt(document.getElementById('dob').value),
    };

    fetch('http://localhost:8080/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData),
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch((error) => console.error('Error:', error));
}
function loadUserData() {
    fetch('http://localhost:8080/add') // Ensure this matches your GET endpoint
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok ' + response.statusText);
            }
            return response.json();
        })
        .then(userProfiles => {
            const tableBody = document.getElementById('userTableBody');
            tableBody.innerHTML = ''; // Clear existing data

            userProfiles.forEach(userProfile => {
                const row = `
                    <tr>
                        <td>${userProfile.username}</td>
                        <td>${userProfile.lastName}</td>
                        <td>${userProfile.firstName}</td>
                        <td>${userProfile.dob}</td>
                    </tr>
                `;
                tableBody.innerHTML += row;
            });
        })
        .catch(error => {
            console.error('Error fetching data:', error);
            alert('Error fetching data: ' + error.message);
        });
}