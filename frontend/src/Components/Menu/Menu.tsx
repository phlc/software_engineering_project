import {Tabs, Tab} from '@material-ui/core'
import AccountCircleSharpIcon from '@material-ui/icons/AccountCircleSharp'
import { useCallback, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { useGlobal } from '../../Contexts/Global/Global'
import { useToast } from '../../Contexts/Toast/Toast'
import { AuthenticatedUser } from '../../types'
import { SignModalEnum } from '../../types'

import './Menu.css'

type MenuProps = {
    style?: any;
}

export const Menu = ({
    style
}: MenuProps) => {
    const [pageSelected, setTableSected] = useState(0)
    const { authenticatedUser, setAuthenticatedUser, setShowSignModal } = useGlobal()
    const { addToast } = useToast();

    const navigate = useNavigate();

    const handleChange = useCallback((e: React.ChangeEvent<{}>, newValue: number) => {
        setTableSected(newValue)
    },[])

    const handleFavoritesNavigation = () => {
        if(authenticatedUser.cpf) {
            navigate('/favorites');
        }
        else {
            addToast({
                type:"error",
                title: "Realizar login",
                description: "Você precisar realizar o login para acessar essa página."
            });
        }
    };

    const handleCartNavigation = () => {
        if(authenticatedUser.cpf) {
            navigate('/shopping-cart');
        }
        else {
            addToast({
                type:"error",
                title: "Realizar login",
                description: "Você precisar realizar o login para acessar essa página."
            });
        }
    };

    return(
        <div className="menu-container" style={style}>
            <Tabs value={pageSelected} onChange={handleChange}>
                <Tab label="Lançamentos" onClick={() => navigate('/')}/>
                <Tab label="Favoritos" onClick={handleFavoritesNavigation}/>
                <Tab label="Carrinho" onClick={handleCartNavigation}/>
                <Tab label={
                    <div 
                        className='login-tab' 
                        onClick={() => authenticatedUser ? 
                            setShowSignModal(SignModalEnum.SIGN_IN) : 
                            setAuthenticatedUser({} as AuthenticatedUser)
                        }
                    >
                        <AccountCircleSharpIcon/>
                        <span >{authenticatedUser ? "Entrar" : "Sair"}</span>
                    </div>
                }/>
            </Tabs>
        </div>
    )
}