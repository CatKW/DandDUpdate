<template>
    <div>
        <h1 class="title"> Add Weapon</h1>
        <div class="field">
            <label class="label" for="type">Weapon: Type</label>
            <div class="controller">
                <input id="type" class="input" type="text" v-model="weapon.type" placeholder="Weapon Type"/>
            </div>
        </div>

        <div class="field">
            <label class="label" for="name">Weapon: Name</label>
            <div class="controller">
                <input id="name" class="input" type="text" v-model="weapon.name" placeholder="Weapon Name"/>
            </div>
        </div>

        <div class="field">
            <label class="label" for="damage">Weapon: Damage</label>
            <div class="controller">
                <input id="damage" class="input" type="text" v-model="weapon.damage" placeholder="Dice Roll and Damge Type"/>
            </div>
        </div>

        <div class="field">
            <label class="label" for="weight">Weapon: Weight</label>
            <div class="controller">
                <input id="weight" class="input" type="number" v-model="weapon.weight" placeholder="Weight in lbs"/>
            </div>
        </div>
        
        <div class="field is-grouped">
            <div class="control">
                <button @click="cancel" class="button">Cancel</button>
            </div>
            <div class="control">
                <button @click="save" class="button is-primary">Save</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'AddWeapon',
    data: () => ({
        weapon: {
            type: "",
            name: "",
            damage: "",
            weight: ""
        }
    }),
    methods: {
        async save () {
            console.log('AddWeapon.save() weapon=', this.weapon )
            const response = await this.$http.post('http://localhost:8080/api/weapons/', this.weapon);
            console.log('AddWeapon.save() response=', response);
            this.$router.push({path: '/weapons'})
        },
        cancel() {
            this.$router.push({path: '/weapons'})
        },
       
    }
}
</script>

<style scoped>
.button {
    float: right;
    margin-top: 10px;
    margin-bottom: 10px;
    background-color: darkblue;
    color: white;    
}

.button:hover {
    background-color: green;
    color: white;
}

.title {
    color: darkblue;
}

</style>