<template>
    <div>
        <h1 class="title">Add Armor</h1>

        <div class="field">
            <label class="label">Armor: Type</label>
            <div  class="control">
                <input class="input" type="text" v-model="armor.type" placeholder="Armor Type"/>
            </div>
       </div>

        <div class="field">
            <label class="label">Armor: Name</label>
            <div class="control">
                <input class="input" type="text" v-model="armor.name" placeholder="Armor Type"/>
            </div>
        </div>

        

        <div class="field">
            <label class="label">Armor: Class Number</label>
            <div class="control">
                <input class="input" type="number" v-model="armor.classNumber" placeholder="example: 11"/>
            </div>
        </div>

        <div class="field">
            <label class="label">Armor: Modifier</label>
            <div class="contorl">
                <input class="input" type="text" v-model="armor.modifier" placeholder="+ example + Dex Modifier(max 2)"/>
            </div>
        </div>

        <div class="field">
            <label class="label">Armor: Weight</label>
            <div class="control">
                <input class="input" type="number" v-model="armor.weight" placeholder="Weight in lbs"/>
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
    name: 'AddArmor',
    data: () => ({
        armor: {
            type: "",
            name: "",
            classNumber: "",
            modifier: "",
            weight: ""
        }
    }),
    methods: {
        async save() {
            console.log('AddArmor.save() armor=', this.armor)
            const response = await this.$http.post('http://localhost:8080/api/armor/', this.armor);
            console.log('AddArmor.save() response=', response);
            this.$router.push({path: '/armors'})
        }, 
        cancel() {
            this.$router.push({path: '/armors'})
        }, 
        async getArmor() {
            const data = await this.$http.get('http://localhost:8080/api/armor');
            console.log('getArmors data', data)
            return data;
        }
    }
}
</script>

<style scoped>
.button {
    float: right;
    margin-top: 10px;
    margin-bottom: 10px;
}
.button:hover {
    background-color: green;
}

.button.is-primary {
    background-color: darkblue;
}

.button.is-primary:hover {
    background-color: green;
}
.title {
    color: darkblue;
}

</style>

